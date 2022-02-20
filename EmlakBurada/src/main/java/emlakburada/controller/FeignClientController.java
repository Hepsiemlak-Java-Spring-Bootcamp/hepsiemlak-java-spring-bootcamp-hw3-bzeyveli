package emlakburada.controller;

import emlakburada.client.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign")
public class FeignClientController {

    @Autowired
   private FeignClient feignClient;


    @RequestMapping(method = RequestMethod.POST, value="/client")
    public void saveFeignClient() {

    }
}
