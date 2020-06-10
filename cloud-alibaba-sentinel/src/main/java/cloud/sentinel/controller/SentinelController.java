package cloud.sentinel.controller;

import cloud.sentinel.client.SsoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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


    @GetMapping("/feignClient")
    public String getByFeignClient() {
        return "通过FeignClient获取到的token:" + ssoClient.getToken();
    }

    @GetMapping("/feignClient1")
    public ResponseEntity getByfeignClient1() {
        Entity entity = new Entity();
        entity.setName("Sentinel");
        entity.setAge(18);
        return new ResponseEntity(entity, HttpStatus.OK);
    }


    class Entity {

        private String name;

        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
