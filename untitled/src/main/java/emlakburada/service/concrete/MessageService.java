package emlakburada.service.concrete;

import emlakburada.dto.request.MessageRequest;
import emlakburada.dto.response.MessageResponse;
import emlakburada.model.Message;
import emlakburada.repository.MessageRepository;
import emlakburada.service.abstracts.MessageServiceHelper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService implements MessageServiceHelper {

    private MessageRepository messageRepository;

    private ModelMapper modelMapper;

    @Autowired
    public MessageService(MessageRepository messageRepository, ModelMapper modelMapper) {
        this.messageRepository = messageRepository;
        this.modelMapper = modelMapper;
    }
    @Override
    public MessageResponse create(MessageRequest messageRequest){
        Message message = modelMapper.map(messageRequest,Message.class);   // gelen messageRequest istegini Message objesine dönüştürdüm
        // amaçım Message objesini servise ile Repository arasında kullanmak
        Boolean result = messageRepository.create(message);

        if(result){  // gelen deger true ise Message objemizi MessageResponse classına dönüştürerek istegi karşılamak
            return modelMapper.map(message, MessageResponse.class);
        }
        return  null;  // gelen deger false ise kayıt başarısız oluyor. Hata mesajı verilebilir
    }

    @Override
    public List<MessageResponse> findAll(){
        List<Message> messageList = messageRepository.findAll();  // messageList'i repository' den okuduk.
        List<MessageResponse> messageResponseList =new ArrayList<>();  // geri dönüş listesi
        for (Message message: messageList) {
            // Message objesini messageResponse donderip listeye attık
            messageResponseList.add(modelMapper.map(message,MessageResponse.class));
        }
        return messageResponseList;
    }

    @Override
    public MessageResponse findOne(String title){
        Message message = messageRepository.findOne(title);
        return modelMapper.map(message,MessageResponse.class);
    }
}
