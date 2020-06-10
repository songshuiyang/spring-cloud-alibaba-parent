# spring-cloud-alibaba-parent

spring-cloud-alibaba 练习项目

### 模块介绍

|    子模块      |       描述      |    
|:----------|:------------- |
|   cloud-alibaba-config   |   使用nacos作为配置中心    | 


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

* 直接下载：[Nacos Server 下载页](https://github.com/alibaba/nacos/releases) 

* Windows 操作系统，执行命令 `cmd startup.cmd`

#### [Sentinel文档](https://github.com/alibaba/Sentinel/wiki/%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8#%E5%AE%9A%E4%B9%89%E8%B5%84%E6%BA%90)

* Sentinel 是阿里巴巴开源的分布式系统的流量防卫组件，Sentinel 把流量作为切入点，从流量控制，熔断降级，系统负载保护等多个维度保护服务的稳定性。

* 直接下载：[下载 Sentinel 控制台](http://edas-public.oss-cn-hangzhou.aliyuncs.com/install_package/demo/sentinel-dashboard.jar) 

* 启动命令`java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar`