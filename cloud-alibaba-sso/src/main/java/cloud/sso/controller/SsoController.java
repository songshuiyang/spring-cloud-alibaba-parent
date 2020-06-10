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
        try {
            Thread.sleep(random() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return UUID.randomUUID().toString().replace("-","");
    }

    // 生成0-10的数字
    public static int random() {
        java.util.Random random = new java.util.Random();
        int result = random.nextInt(10);
        return result + 1;
    }

}
