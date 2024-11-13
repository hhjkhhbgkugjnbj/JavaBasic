package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {

		/*
		 * {
		 * "no" : 1,
		 * "message" : "1page list",
		 * "data" : [
		 * 				{
		 * 					"name"	: "홍길동",
		 * 					"주소"	: "부산광역시 서구",
		 * 					"연락처"	: "010-1234-5678",
		 * 					"성별		: 0
		 * 				},
		 * 				{
		 * 					"name", : "홍길서",
		 * 					"주소" 	: "부산광역시 진구",
		 * 					"연락처" 	: "010-1111-2222"
		 * 					"성별" 	: 1
		 * 				}
		 * 			]
		 * 
		 *  }
		 */
		Map<String, Object> map1 = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		Map<String, Object> map3 = new HashMap<String, Object>();

		List<Map<String, Object>> strList = new ArrayList<Map<String, Object>>();
		
		map1.put("name", "홍길동");
		map1.put("주소", "부산광역시 서구");
		map1.put("연락처", "010-1234-5678");
		map1.put("성별", "0");
		
		map2.put("name", "홍길서");
		map2.put("주소", "부산광역시 진구");
		map2.put("연락처", "010-1111-2222");
		map2.put("성별", "1");

		strList.add(map1);
		strList.add(map2);
		
		map3.put("no" , "1");
		map3.put("meseage", "1page list");
		map3.put("data", strList);
		
		System.out.println(map3);
		
	}

}
