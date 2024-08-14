package com.zyj.zyjrpc.fault.tolerant;

import com.zyj.zyjrpc.spi.SpiLoader;

/**
 * 容错策略工厂(工厂模式,用户获取容错策略对象)
 */
public class TolerantStrategyFactory {
    static{
        SpiLoader.load(TolerantStrategy.class);
    }

    /**
     * 默认容错策略
     */
    private static final TolerantStrategy DEFAULT_RETRY_STRATEGY = new FailFastTolerantStrategy();

    /**
     * 获取实例
     * @param key
     * @return
     */
    public static TolerantStrategy getInstance(String key){
        return SpiLoader.getInstance(TolerantStrategy.class, key);
    }
}