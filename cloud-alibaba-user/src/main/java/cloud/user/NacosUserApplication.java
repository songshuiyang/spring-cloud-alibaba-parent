package cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author songsy
 * @date 2019/11/1 16:51
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "cloud.user.client")
public class NacosUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosUserApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
