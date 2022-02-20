package emlakburada.queue;

import emlakburada.service.concrete.EmailMessage;

public interface QueueService {
	
	void sendMessage(EmailMessage email);

}
