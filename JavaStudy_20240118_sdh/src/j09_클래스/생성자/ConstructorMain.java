package j09_클래스.생성자;

public class ConstructorMain {

	public static void main(String[] args) {
		Constructor1 constructor1 = new Constructor1();
		Constructor1 constructor12 = new Constructor1("홍길동");
		Constructor1 constructor13 = new Constructor1(18);
		Constructor1 constructor14 = new Constructor1("홍길동",18);

		System.out.println(constructor1);
		System.out.println();
		System.out.println(constructor12.name);
	}

}
