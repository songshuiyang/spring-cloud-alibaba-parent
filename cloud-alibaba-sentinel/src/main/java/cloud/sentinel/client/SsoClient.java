package cloud.sentinel.client;

import cloud.sentinel.fallback.SsoFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author songsy
 * @date 2020/6/9 17:04
 */
@FeignClient(value = "cloud-alibaba-sso", fallbackFactory = SsoFallbackFactory.class)
public interface SsoClient {

    @GetMapping("/token")
    String getToken();

}
