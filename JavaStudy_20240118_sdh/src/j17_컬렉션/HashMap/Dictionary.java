package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {

		/*
		 * 축구(soccer)
		 * 야구(baseball)
		 * 농구(basketball)
		 * 골프(golf)
		 * 
		 * [사전]
		 * 1. 검색기능(종료 q)
		 * 2. 추가기능(종료 q)
		 * 3. 전체 조회
		 * # 프로그램 종료(exit)
		 * 
		 * 1선택
		 * 검색어: 축구
		 * soccer
		 * 검색어: 농구
		 * basketball
		 * q
		 * 
		 * 2선택
		 * 한글: 볼링
		 * 영어: bowling
		 * 
		 * 한글: 배구
		 * 영어: volleyball
		 * 
		 * 3선택
		 * 축구(soccer)
		 * 야구(baseball)
		 * 농구(basketball)
		 * 골프(golf)
		 * 볼링(bowling)
		 * 배구(volleyball)
		 */
		HashMap<String, String> strMap = new HashMap<String, String>();

		strMap.put("축구", "soccer");
		strMap.put("야구", "baseball");
		strMap.put("농구", "basketball");
		strMap.put("골프", "golf");
//		strMap.put("볼링", "bowling");
//		strMap.put("배구", "volleyball");

		//System.out.println(strMap);
		
		Scanner scanner = new Scanner(System.in);
		String select = null;
		String korean = null;
		String english = null;
		while (true) {
			System.out.println("축구(soccer)\n야구(baseball)\n농구(basketball)\n골프(golf)");
			System.out.println("\n");
			System.out.println("[사전]\n1. 검색기능(종료 q)\n2. 추가기능(종료 q)\n3. 전체 조회\n# 프로그램 종료(exit)");

			select = scanner.nextLine();
			if (select.equals("1")) {
				String searchText = null;
				while (true) {
					System.out.print("검색어: ");
					searchText = scanner.nextLine();
					if(searchText.equals("q")) {
						break;
					}
					System.out.println(strMap.get(searchText));
				}
			} else if (select.equals("2")) {
				while (true) {
					System.out.print("한글: ");
					korean = scanner.nextLine();
					System.out.print("영어: ");
					english = scanner.nextLine();
					if(korean.equals("q") || english.equals("q")) {
						break;
					}
					strMap.put(korean, english);
				}
			} else if (select.equals("3")) {
				for(String key : strMap.keySet()) {
					System.out.println(key + "(" + strMap.get(key) + ")");
				}
				
			} else if(select.equals("exit")){
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
