package com.zyj.example.provider;

import com.zyj.example.common.service.UserService;
import com.zyj.zyjrpc.RpcApplication;
import com.zyj.zyjrpc.registry.LocalRegistry;
import com.zyj.zyjrpc.server.HttpServer;
import com.zyj.zyjrpc.server.VertxHttpServer;

/**
 * 服务提供者示例
 */
public class ProviderExample {
    public static void main(String[] args){
        // RPC 框架初始化
        RpcApplication.init();

        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动Web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(RpcApplication.getRpcConfig().getServerPort());
    }
}
