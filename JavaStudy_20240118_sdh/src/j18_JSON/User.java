package j18_JSON;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

	private int userCode;
	private String username;
	private String password;
	private String name;
	private String email;
	private String address;
	private String phone;
	private List<String> hobby;
}
