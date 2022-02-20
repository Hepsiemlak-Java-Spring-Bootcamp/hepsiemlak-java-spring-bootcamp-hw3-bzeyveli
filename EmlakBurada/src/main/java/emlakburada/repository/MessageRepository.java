package emlakburada.repository;

import emlakburada.model.Message;
import emlakburada.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class MessageRepository {

    private static List<Message> messageList = new ArrayList<>();

    static {
        User user = new User("Bireysel","bekir","bekirzeyveli44@gmail.com");
        User user1 = new User("Bireysel","Kadir","Kadirzeyveli44@gmail.com");
        Message message = new Message("Dosta gider!","Halen satılık mı ? ",new Date(),new Date(),false,user,user1);
        messageList.add(message);
    }

    public boolean create(Message message){
       messageList.add(message);
       return true;
    }

    public List<Message> findAll(){
        return messageList;
    }

    public Message findOne(String title){
        for (Message message:messageList) {
                if(message.getBaslik().equals(title)){
                    return message;
                }
        }
        return null;
    }

}
