package com.zyj.zyjrpc.fault.tolerant;

import com.zyj.zyjrpc.model.RpcResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class FailOverTolerantStrategy implements TolerantStrategy{

    @Override
    public RpcResponse doTolerant(Map<String, Object> context, Exception e){
        // todo 可自行拓展,获取其他服务节点并调用
        return null;
    }
}
