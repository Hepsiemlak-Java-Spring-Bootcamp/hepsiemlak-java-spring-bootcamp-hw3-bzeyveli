package emlakburada.queue;

import emlakburada.config.JmsProducer;
import emlakburada.service.concrete.EmailMessage;
import org.springframework.beans.factory.annotation.Autowired;

public class ActiveMqService implements QueueService{

	@Autowired
	JmsProducer jmsProducer;

	@Override
	public void sendMessage(EmailMessage email) {
		jmsProducer.send(String.valueOf(email));
	}

}
