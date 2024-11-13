package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {

		HashMap<Integer, String> strMap = new HashMap<Integer,String>();
		
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");

		strMap.put(1, "java2");
		strMap.put(1, "java3");

		strMap.put(10, "java1");
		strMap.put(20, "java1");
		strMap.put(30, "java1");
		strMap.put(40, "java1");
		// Map은 순서가 없고 값의 중복은 허용하고
		// 키의 중복은 허용하지 않는다.
		
		System.out.println(strMap);
		
		// Map은 foreach가 안됨.
//		for(Integer key : strMap) {
//			
//		}
		
//		for(int i = 0; i < strMap.size(); i++) {
//			System.out.println(strMap[i]);
//		}
//		System.out.println(strMap.keySet());
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
			
		}
		//키 값중에 해당하는 key값이 있는지 확인
		System.out.println(strMap.containsKey(15));
		System.out.println(strMap.containsKey(20));
		
		//value값 중에 해당하는 value 값이 있는지 확인
		System.out.println(strMap.containsValue("java3"));
		System.out.println(strMap.containsValue("java7"));

	}

}
