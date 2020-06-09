package cloud.user.controller;

import cloud.user.client.SsoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author songsy
 * @date 2020/6/5 16:52
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SsoClient ssoClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/restTemplate")
    public String getByRestTemplate() {
        // 调用 cloud-alibaba-sso 服务接口
        return "通过RestTemplate获取到的token" + restTemplate.getForObject("http://cloud-alibaba-sso/token", String.class);
    }


    @RequestMapping("/feignClient")
    public String getByFeignClient() {
        return "通过FeignClient获取到的token" + ssoClient.getToken();
    }


}
