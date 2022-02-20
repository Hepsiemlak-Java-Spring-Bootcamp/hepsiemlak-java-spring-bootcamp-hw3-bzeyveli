package emlakburada.repository;

import emlakburada.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {


    private static List<User> userList = new ArrayList<>();

    static {
        User user = new User("Bireysel", "Bekir", "bekirzeyveli44@gmail.com");
        userList.add(user);
        User user1 = new User("Kurumsal", "Patika.dev", "patikadev@patika.com");
        userList.add(user1);
        User user2 = new User("Bireysel", "Kadir", "kadirZeyveli44@gmail.com");
        userList.add(user2);
    }

    public boolean create(User user) {
        return userList.add(user);
    }

    public List<User> findAll(){
        return userList;
    }

}
