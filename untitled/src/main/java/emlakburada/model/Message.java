package emlakburada.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

	@Setter
	private String baslik;
	private String icerigi;
	private Date gonderilenTarih;
	private Date okunduguTarihi;
	private boolean gorulduMu;
	private User gonderici;
	private User alici;

	public Message(String baslik) {
		super();
		this.baslik = baslik;
	}

}