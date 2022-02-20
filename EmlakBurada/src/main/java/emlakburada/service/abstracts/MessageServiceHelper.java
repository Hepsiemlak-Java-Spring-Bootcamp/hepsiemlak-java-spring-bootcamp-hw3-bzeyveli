package emlakburada.service.abstracts;

import emlakburada.dto.request.MessageRequest;
import emlakburada.dto.response.MessageResponse;

import java.util.List;

public interface MessageServiceHelper {

    MessageResponse create(MessageRequest messageRequest);

    List<MessageResponse> findAll();

    MessageResponse findOne(String title);

}
