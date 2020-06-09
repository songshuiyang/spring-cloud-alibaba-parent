package cloud.sso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author songsy
 * @date 2020/6/5 16:52
 */
@RestController
@RequestMapping("/token")
public class SsoController {

    @GetMapping
    public String getToken() {
        return UUID.randomUUID().toString().replace("-","");
    }

}
