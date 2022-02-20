package emlakburada.client;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.cloud.netflix.feign.FeignClient(url = "http://localhost:8081/banners")
public interface FeignClient {

    @RequestMapping(method = RequestMethod.POST, value="/client")
    void saveFeignClient();
}
