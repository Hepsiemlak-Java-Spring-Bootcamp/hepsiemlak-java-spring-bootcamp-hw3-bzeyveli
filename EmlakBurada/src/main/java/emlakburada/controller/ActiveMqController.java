package emlakburada.controller;

import emlakburada.queue.ActiveMqService;
import emlakburada.service.concrete.EmailMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveMqController {

    @Autowired
    ActiveMqService activeMqService;

    public void produce (@RequestParam("message") EmailMessage message){
        activeMqService.sendMessage(message);
    }
}
