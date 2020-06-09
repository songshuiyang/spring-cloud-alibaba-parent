package cloud.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public String get(@PathVariable(value = "id") String id) {
        // 调用 cloud-alibaba-sso 服务接口
        return "用户" + id + restTemplate.getForObject("http://cloud-alibaba-sso/token", String.class);
    }

}
