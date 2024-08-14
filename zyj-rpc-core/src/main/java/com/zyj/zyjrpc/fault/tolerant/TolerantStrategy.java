package com.zyj.zyjrpc.fault.tolerant;

import com.zyj.zyjrpc.model.RpcResponse;

import java.util.Map;

/**
 * 容错策略
 */
public interface TolerantStrategy {

    /**
     * 容错
     * @param context
     * @param e
     * @return
     */
    RpcResponse doTolerant(Map<String, Object> context, Exception e);
}
