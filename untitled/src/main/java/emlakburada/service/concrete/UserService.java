package emlakburada.service.concrete;

import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;
import emlakburada.model.User;
import emlakburada.repository.DbConnectionRepository;
import emlakburada.repository.IlanRepository;
import emlakburada.repository.UserRepository;
import emlakburada.service.abstracts.UserServiceHelper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceHelper {

    @Autowired
    @Qualifier(value = "mongoConnectionRepository")
    private DbConnectionRepository dbConn;

    @Autowired
    private IlanRepository ilanRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void getAllUsers() {
        System.out.println("KullaniciService -> ilanRepository: " + ilanRepository.toString());
    }

    @Override
    public List<UserResponse> findAll() {
        List<User> userList = userRepository.findAll();
        List<UserResponse> userResponseList = new ArrayList<>();
        for (User user : userList) {
            userResponseList.add(modelMapper.map(user, UserResponse.class));
        }
        return userResponseList;
    }

    @Override
    public UserResponse create(UserRequest userRequest) {
        User user = modelMapper.map(userRequest, User.class);
        boolean result = userRepository.create(user);
        if (result) {
            return modelMapper.map(user, UserResponse.class);
        }
        return null;
    }

    @Override
    public UserResponse findOne(String email) {
        List<User> userList = userRepository.findAll();

        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return modelMapper.map(user, UserResponse.class);
            }
        }
        return null;   // email'e kayıtlı kullanıcı bulunamaz ise null degerini dönderir.
    }

}
