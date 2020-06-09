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

#### Nacos控制台

* 可以通过下面的界面来动态设置配置

![](https://github.com/songshuiyang/spring-cloud-alibaba-parent/blob/master/docment/image/nacos-config.png)

* 查看已注册的服务，服务调用可以通过`RestTemplate`或者`FeignClient`来实现

![](https://github.com/songshuiyang/spring-cloud-alibaba-parent/blob/master/docment/image/nacos-server.jpg)

### 文档

#### [Nacos官网](https://nacos.io/zh-cn/)   

* Nacos 的关键特性包括:
    * 服务发现和服务健康监测
    * 动态配置服务
    * 动态 DNS 服务
    * 服务及其元数据管理
    * [更多的特性列表 ...](https://nacos.io/zh-cn/docs/roadmap.html)

 