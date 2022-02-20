package emlakburada.service.abstracts;

import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;

import java.util.List;

public interface UserServiceHelper {

    void getAllUsers();

    List<UserResponse> findAll();

    UserResponse create(UserRequest userRequest);

    UserResponse findOne(String name);

}
