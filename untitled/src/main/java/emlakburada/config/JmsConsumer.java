package emlakburada.config;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
/*
Jms mesajlarını dinlemek için bir JmsConsumer bileşeni oluşturmak için @JmsListener  ve
 jsaFactory containerFactory (ActiveMqConnectionFactoryConfig'de kurulmuş olan) ek açıklamasını kullandık
 */
    @JmsListener(destination = "${spirng.activemq.queue}", containerFactory = "springFactory")
    public void receive( String message){
        System.out.println(message);
    }
}
