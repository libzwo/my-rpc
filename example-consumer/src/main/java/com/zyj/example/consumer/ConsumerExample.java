package com.zyj.example.consumer;

import com.zyj.zyjrpc.config.RpcConfig;
import com.zyj.zyjrpc.utils.ConfigUtils;

/**
 * 简易服务消费者示例
 */
public class ConsumerExample {

    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class,"rpc");
        System.out.println(rpc);
    }
}
