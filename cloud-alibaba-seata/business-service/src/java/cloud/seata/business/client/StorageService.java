package cloud.seata.business.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("storage-service")
public interface StorageService {

    @GetMapping(path = "/storage/{commodityCode}/{count}")
    String storage(@PathVariable("commodityCode") String commodityCode,
                   @PathVariable("count") int count);
}
