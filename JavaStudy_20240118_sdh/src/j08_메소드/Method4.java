package j08_메소드;

import java.io.IOException;
import java.util.Scanner;

public class Method4 {
	/*
	 * <설문>
	 * 이름 : 홍길동
	 * 나이 : 18
	 * 
	 * 이름은 홍길동이고 나이는 18세 입니다.
	 * 
	 * 이름 : 홍길동 
	 * 나이 : 엔터
	 * 이름은 홍길동입니다.
	 * 나이는 미입력입니다. 
	 * 
	 * 이름 : 엔터
	 * 나이 : 20
	 * 나이는 20세 입니다. 
	 * 이름은 미입력입니다.
	 * 
	 * * 오버로딩 무조건 사용하세요
	 * *** keycode 참고
	 */
	public static void surveyNameAge(String name, String age) {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세 입니다.");
	}
	public static void surveyNameAge2(String nameAge) {
		if(nameAge.length() == 3) {
			System.out.println("이름은 " + nameAge + "입니다.");
			System.out.println("나이는 미입력 입니다.");
		}else if(nameAge.length() == 1 || nameAge.length() == 2) {
			System.out.println("이름은 미입력 입니다.");
			System.out.println("나이는 " + nameAge + "세 입니다.");
		}
	}
	
	public static void survayNameAge3() {
		System.out.println("이름은 미입력 입니다.");
		System.out.println("나이는 미입력 입니다.");
	}
	public static void survey() {
		Scanner scanner = new Scanner(System.in);
		String name;
		String age;
		System.out.println("<설문>");
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("나이 : ");
		age = scanner.nextLine();
		
		if(!name.equals("") && !age.equals("")) {
			surveyNameAge(name,age);
		}else if(!name.equals("") || !age.equals("")) {
			if(name.equals("")) {
				surveyNameAge2(age);
			}else {
				surveyNameAge2(name);
			}
		}else {
			survayNameAge3();
		}
	}
	
	public static void main(String[] args) throws IOException {
//		int code = 0;
//		code = System.in.read();
//		System.out.println(code);
		survey();
	}
}
