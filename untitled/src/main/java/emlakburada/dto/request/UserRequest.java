package emlakburada.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequest {

    private String kullaniciTipi; // bireysel & kurumsal & yeniTip
    private String isim;
    private String email;
    private String fotograf;
    private String biyografi;
}
