# spring-cloud-alibaba-parent

Spring Cloud Alibaba 学习练习项目，[官网传送门](https://github.com/alibaba/spring-cloud-alibaba)

### 官网介绍

Spring Cloud Alibaba 致力于提供微服务开发的一站式解决方案。此项目包含开发分布式应用微服务的必需组件，方便开发者通过 Spring Cloud 编程模型轻松使用这些组件来开发分布式应用服务。

依托 Spring Cloud Alibaba，您只需要添加一些注解和少量配置，就可以将 Spring Cloud 应用接入阿里微服务解决方案，通过阿里中间件来迅速搭建分布式应用系统。

参考文档 请查看 [WIKI](https://github.com/alibaba/spring-cloud-alibaba/wiki) 。

为 Spring Cloud Alibaba 贡献代码请参考 [如何贡献](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E5%A6%82%E4%BD%95%E8%B4%A1%E7%8C%AE%E4%BB%A3%E7%A0%81) 。

#### 主要功能

* **服务限流降级**：默认支持 WebServlet、WebFlux, OpenFeign、RestTemplate、Spring Cloud Gateway, Zuul, Dubbo 和 RocketMQ 限流降级功能的接入，可以在运行时通过控制台实时修改限流降级规则，还支持查看限流降级 Metrics 监控。
* **服务注册与发现**：适配 Spring Cloud 服务注册与发现标准，默认集成了 Ribbon 的支持。
* **分布式配置管理**：支持分布式系统中的外部化配置，配置更改时自动刷新。
* **消息驱动能力**：基于 Spring Cloud Stream 为微服务应用构建消息驱动能力。
* **分布式事务**：使用 @GlobalTransactional 注解， 高效并且对业务零侵入地解决分布式事务问题。。
* **阿里云对象存储**：阿里云提供的海量、安全、低成本、高可靠的云存储服务。支持在任何应用、任何时间、任何地点存储和访问任意类型的数据。
* **分布式任务调度**：提供秒级、精准、高可靠、高可用的定时（基于 Cron 表达式）任务调度服务。同时提供分布式的任务执行模型，如网格任务。网格任务支持海量子任务均匀分配到所有 Worker（schedulerx-client）上执行。
* **阿里云短信服务**：覆盖全球的短信服务，友好、高效、智能的互联化通讯能力，帮助企业迅速搭建客户触达通道。


### 练习模块介绍

|    子模块      |       描述      |    
|:----------|:------------- |
|   cloud-alibaba-config   |   使用nacos作为配置中心    | 
|   cloud-alibaba-seata   |   分布式事务解决方案    | 
|   cloud-alibaba-sentinel   |   流量控制，熔断降级，系统负载    | 
|   cloud-alibaba-sso   |    使用nacos作为服务发现   | 
|   cloud-alibaba-user   |    使用nacos作为服务发现   | 

### 使用技术

* Spring Boot 1.5.7.RELEASE

* Spring Cloud Edgware.SR2
    * spring-cloud-starter-feign
    
* com.alibaba.cloud
    * [spring-cloud-starter-alibaba-nacos-config](https://nacos.io/zh-cn/)  （配置中心）
    * [spring-cloud-starter-alibaba-nacos-discovery](https://nacos.io/zh-cn/) （服务注册发现）
    * [spring-cloud-starter-alibaba-sentinel](https://github.com/alibaba/Sentinel/wiki/%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8#%E5%AE%9A%E4%B9%89%E8%B5%84%E6%BA%90)（流量控制，熔断降级）

#### Nacos控制台

* 可以通过下面的界面来动态设置配置

![](https://github.com/songshuiyang/spring-cloud-alibaba-parent/docment/image/nacos-config.png)

* 查看已注册的服务，服务调用可以通过`RestTemplate`或者`FeignClient`来实现

![](https://github.com/songshuiyang/spring-cloud-alibaba-parent/docment/image/nacos-server.jpg)

### 文档

#### [Nacos官网](https://nacos.io/zh-cn/)   

* Nacos 的关键特性包括:
    * 服务发现和服务健康监测
    * 动态配置服务
    * 动态 DNS 服务
    * 服务及其元数据管理
    * [更多的特性列表 ...](https://nacos.io/zh-cn/docs/roadmap.html)
    
#### 启动控制台

* 直接下载：[Nacos Server 下载页](https://github.com/alibaba/nacos/releases) 

* Windows 操作系统，执行命令 `cmd startup.cmd`

#### 客户端接入控制台

* 注意连接配置要写到`bootstrap.yml`文件中，不然启动会报错

```java
server:
  port: 9000
spring:
  application:
    name: cloud-alibaba-config
  cloud:
    nacos:
      config:
        server-addr: 127.0.0.1:8848
      discovery:
        server-addr: 127.0.0.1:8848
```

#### [Sentinel文档](https://github.com/alibaba/Sentinel/wiki/%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8#%E5%AE%9A%E4%B9%89%E8%B5%84%E6%BA%90)

* Sentinel 是阿里巴巴开源的分布式系统的流量防卫组件，Sentinel 把流量作为切入点，从流量控制，熔断降级，系统负载保护等多个维度保护服务的稳定性。

#### 启动控制台

* 直接下载：[下载 Sentinel 控制台](http://edas-public.oss-cn-hangzhou.aliyuncs.com/install_package/demo/sentinel-dashboard.jar) 

* 启动命令`java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar`

#### 客户端接入控制台

* 引入JAR包，客户端需要引入 Transport 模块来与 Sentinel 控制台进行通信。您可以通过 pom.xml 引入 JAR 包:

```java
<dependency>
    <groupId>com.alibaba.csp</groupId>
    <artifactId>sentinel-transport-simple-http</artifactId>
    <version>1.7.0</version>
</dependency>
```

* 启动时加入 JVM 参数`-Dproject.name=cloud-alibaba-sentinel -Dcsp.sentinel.dashboard.server=127.0.0.1:8080`

#### [Seata文档](http://seata.io/zh-cn/index.html)

* Seata 是一款开源的分布式事务解决方案，致力于在微服务架构下提供高性能和简单易用的分布式事务服务