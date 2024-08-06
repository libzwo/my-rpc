# noob-rpc
​	手写RPC框架：RPC框架学习、扩展（简易版RPC框架、扩展版PPC框架）

## RPC框架介绍

> 项目简介

​	基于 Java + Etcd + Vert.x 的高性能 RPC 框架，用新颖的技术栈从0到1开发轮子。学习并实践基于 Vert.x 的网络服务器、序列化器、基于 Etcd 和 ZooKeeper 的注册中心、反射、动态代理、SPI机制、自定义网络协议、多种设计模式(单例/工厂/装饰者等)、负载均衡器设计、重试和容错机制、SpringBoot Starter 注解驱动开发等，大幅提升架构设计能力。

​	项目分为简易版和扩展版：

​	简易版（基础RPC框架：实现服务注册和服务发现，完成业务流程调用）

​	扩展版（搭配业务项目使用，技术栈扩展：参考现有RPC框架设计，一步步完善RPC框架设计）



> 技术栈选型

后端技术以 Java 为主，但所有的思想和设计都是可以复用到其他语言的，掌握核心思路即可

- ⭐️ Vert.x 框架
- ⭐️ Etcd 云原生存储中间件（jetcd 客户端）
- ZooKeeper 分布式协调工具（curator 客户端）
- ⭐️ SPI 机制
- ⭐️ 多种序列化器
	- JSON 序列化
	- Kryo 序列化
	- Hessian 序列化
- ⭐️ 多种设计模式
	- 双检锁单例模式
	- 工厂模式
	- 代理模式
	- 装饰者模式
- ⭐️ Spring Boot Starter 开发
- 反射和注解驱动
- Guava Retrying 重试库
- JUnit 单元测试
- Logback 日志库
- Hutool、Lombok 工具库

