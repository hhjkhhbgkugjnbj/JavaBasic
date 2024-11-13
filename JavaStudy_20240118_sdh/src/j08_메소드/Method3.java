package j08_메소드;

public class Method3 {

	/*
	 * 메소드 오버로딩
	 */
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1");
	}
	
	public static void test1(int num) {
		System.out.println("매개변수가 하나이고 int인 test1");
	}
	
	public static void test1(int num1, int num2) {
		System.out.println("매개변수가 두 개이고 모두 int인 test1");
	}
	
	public static void test1(String name, int age) {
		System.out.println("매개변수가 두 개이고 String, int인 test1");
	}
	
	public static void test1(int age, String name) {
		System.out.println("매개변수가 두 개이고 int, String인 test1");
	}
	
	public static void main(String[] args) {
		test1();
		test1(100);
		test1(100, 200);
		test1("홍길동", 18);
		test1(18,"홍길동");
	}

}
