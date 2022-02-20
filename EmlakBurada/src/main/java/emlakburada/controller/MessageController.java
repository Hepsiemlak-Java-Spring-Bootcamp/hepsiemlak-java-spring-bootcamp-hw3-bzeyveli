package emlakburada.controller;

import emlakburada.dto.request.MessageRequest;
import emlakburada.dto.response.MessageResponse;
import emlakburada.service.concrete.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<MessageResponse> create(@RequestBody MessageRequest messageRequest){
        return new ResponseEntity<>(messageService.create(messageRequest), HttpStatus.OK);
    }
    @GetMapping("/messages")
    public ResponseEntity<List<MessageResponse>> findAll(){
        return new ResponseEntity<>(messageService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/messages/{title}")
    public ResponseEntity<MessageResponse> findOne(@PathVariable("title") String title){
        return new ResponseEntity<>(messageService.findOne(title),HttpStatus.OK);
    }
}
