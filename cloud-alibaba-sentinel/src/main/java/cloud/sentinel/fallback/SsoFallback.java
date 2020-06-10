package cloud.sentinel.fallback;

import cloud.sentinel.client.SsoClient;

/**
 * 降级处理
 * @author songsy
 * @date 2020/6/10 10:48
 */
public class SsoFallback  implements SsoClient {

    private Throwable throwable;

    SsoFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String getToken() {
        return "consumer-fallback-default-str" + throwable.getMessage();
    }
}
