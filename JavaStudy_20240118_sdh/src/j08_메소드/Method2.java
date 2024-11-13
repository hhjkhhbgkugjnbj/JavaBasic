package j08_메소드;

public class Method2 {

	//메소드 종류
	
	//반환(리턴)도 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	//반환도 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num: " + num);
		System.out.println("test2 메소드 호출");
	}
	
	//반환도 없고 매개변수가 두 개인 메소드
	public static void test3(String num1, int num2) {
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	//반환은 있고 매개변수는 없는 메소드
	public static int test4() {
		System.out.println("test4 호출");
		return 100;
	}
	
	//반환도 있고 매개변수 있는 메소드
	public static boolean test5(int num) {
		System.out.println("num: " + num);
		return true;
	}
	
	public static void main(String[] args) {
		test1();
		test2(100);
		test3("100",200);
		System.out.println();
		test4();
		System.out.println();
		System.out.println(test5(100));
	}

}
