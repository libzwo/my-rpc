package com.zyj.zyjrpc.loadbalancer;

import com.zyj.zyjrpc.model.ServiceMetaInfo;

import java.util.Map;
import java.util.List;

/**
 * 负载均衡器(消费端使用)
 */
public interface LoadBalancer {
    /**
     * 选择服务调用
     * @param requestParams
     * @param serviceMetaInfoList
     * @return
     */
    ServiceMetaInfo select(Map<String, Object> requestParams, List<ServiceMetaInfo> serviceMetaInfoList);
}
