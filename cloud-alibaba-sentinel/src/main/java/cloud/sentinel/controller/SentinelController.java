package cloud.sentinel.controller;

import cloud.sentinel.client.SsoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songsy
 * @date 2020/6/5 16:52
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {

    @Autowired
    private SsoClient ssoClient;


    @RequestMapping("/feignClient")
    public String getByFeignClient() {
        return "通过FeignClient获取到的token:" + ssoClient.getToken();
    }


}
