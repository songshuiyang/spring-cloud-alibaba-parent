package cloud.sentinel.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author songsy
 * @date 2020/6/10 10:50
 */
@Component
public class SsoFallbackFactory implements FallbackFactory<SsoFallback> {

    @Override
    public SsoFallback create(Throwable throwable) {
        return new SsoFallback(throwable);
    }

}
