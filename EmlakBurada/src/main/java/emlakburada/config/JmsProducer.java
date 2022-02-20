package emlakburada.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${spring.active.queue}")
    String queue;
    public void send(String message){
        jmsTemplate.convertAndSend(queue,message);
    }
}
