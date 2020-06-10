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