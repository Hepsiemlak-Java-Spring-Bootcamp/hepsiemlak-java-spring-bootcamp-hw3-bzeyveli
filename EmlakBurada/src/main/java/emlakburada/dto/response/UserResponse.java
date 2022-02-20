package emlakburada.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponse {

    private String kullaniciTipi; // bireysel & kurumsal & yeniTip
    private String isim;
    private String email;
    private String fotograf;
    private String biyografi;
}
