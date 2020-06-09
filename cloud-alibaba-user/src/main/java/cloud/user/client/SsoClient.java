package cloud.user.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author songsy
 * @date 2020/6/9 17:04
 */
@FeignClient("cloud-alibaba-sso")
public interface SsoClient {

    @GetMapping("/token")
    String getToken();
}
