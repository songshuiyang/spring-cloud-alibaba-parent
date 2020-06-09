package cloud.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author songsy
 * @date 2019/11/1 16:51
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSsoApplication.class, args);
    }

}
