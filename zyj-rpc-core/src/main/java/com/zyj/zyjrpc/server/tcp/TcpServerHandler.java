package com.zyj.zyjrpc.server.tcp;

import com.zyj.zyjrpc.model.RpcRequest;
import com.zyj.zyjrpc.model.RpcResponse;
import com.zyj.zyjrpc.protocol.ProtocolMessage;
import com.zyj.zyjrpc.protocol.ProtocolMessageDecoder;
import com.zyj.zyjrpc.protocol.ProtocolMessageEncoder;
import com.zyj.zyjrpc.protocol.ProtocolMessageTypeEnum;
import com.zyj.zyjrpc.registry.LocalRegistry;
import io.vertx.core.Handler;
import io.vertx.core.net.NetSocket;
import io.vertx.core.buffer.Buffer;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * TCP 请求处理器
 */
public class TcpServerHandler implements Handler<NetSocket> {

    /**
     * 处理请求
     *
     * @param socket
     */
    @Override
    public void handle(NetSocket socket) {
        // 处理连接
        TcpBufferHandlerWrapper bufferHandlerWrapper = new TcpBufferHandlerWrapper(buffer -> {
            //请求处理代码
        });
        socket.handler(bufferHandlerWrapper);
    }
}