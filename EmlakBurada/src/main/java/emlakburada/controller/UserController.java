package emlakburada.controller;

import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;
import emlakburada.service.abstracts.UserServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceHelper userServiceHelper;

    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest){
        return new ResponseEntity<>(userServiceHelper.create(userRequest), HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<List<UserResponse>> findAll(){
        return new ResponseEntity<>(userServiceHelper.findAll(),HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserResponse> findOne(@PathVariable("email") String email){
        return new ResponseEntity<>(userServiceHelper.findOne(email),HttpStatus.OK);
    }
}
