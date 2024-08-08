package com.zyj.example.consumer;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.zyj.example.common.model.User;
import com.zyj.example.common.service.UserService;
import com.zyj.zyjrpc.model.RpcRequest;
import com.zyj.zyjrpc.model.RpcResponse;
import com.zyj.zyjrpc.serializer.JdkSerializer;
import com.zyj.zyjrpc.serializer.Serializer;


import java.io.IOException;


/**
 * 静态代理
 */
public class UserServiceProxy implements UserService {

    public User getUser(User user){
        // 指定序列化器
        Serializer serializer = new JdkSerializer();

        // 发请求
        RpcRequest rpcRequest = RpcRequest.builder()
                .serviceName(UserService.class.getName())
                .methodName("getUser")
                .parameterTypes(new Class[]{User.class})
                .args(new Object[]{user})
                .build();
        try {
            byte[] bodyBytes = serializer.serialize(rpcRequest);
            byte[] result;
            try (HttpResponse httpResponse = HttpRequest.post("http://localhost:8080")
                    .body(bodyBytes)
                    .execute()){
                result = httpResponse.bodyBytes();
            }
            RpcResponse rpcResponse = serializer.deserialize(result, RpcResponse.class);
            return (User) rpcResponse.getData();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
