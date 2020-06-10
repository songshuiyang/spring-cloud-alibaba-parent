package cloud.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author songsy
 * @date 2020/06/10 16:51
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "cloud.sentinel.client")
public class SentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
