package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {

	public static User createUser() {
		
		
		// user 객체(내 정보) 만들고 리턴(*취미 다섯 개)
		//User user = new User(0, null, null, null, null, null, null, null)
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(new String[] {"축구", "농구","야구","골프","배구","탁구"}));
		
		User user = User.builder()
				.userCode(1234)
				.username(null)
				.password("1234")
				.name("신동혁")
				.email("donghyeok@gmail.com")
				.address("부산광역시 진구")
				.phone("010-2846-8901")
				.hobby(Arrays.asList("게임","농구","코딩","롤","여행"))
				.build();
		return user;
	}
}
