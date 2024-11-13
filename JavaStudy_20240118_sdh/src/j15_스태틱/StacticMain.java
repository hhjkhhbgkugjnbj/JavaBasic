package j15_스태틱;

public class StacticMain {

	public static void main(String[] args) {

		StaticTest staticTest = new StaticTest();
		staticTest.name = "홍길동";
		System.out.println(staticTest.name);
		
		StaticTest staticTest2 = new StaticTest();
		System.out.println(staticTest2.name);
		
		StaticTest staticTest3 = new StaticTest();
		System.out.println(staticTest3.name);
		
		staticTest3.name = "홍길서";
		System.out.println(staticTest3.name);
		System.out.println(staticTest.name);
		
		StaticTest.name = "홍길남";
		System.out.println(staticTest.name);
		
		staticTest.printTest();
	}

}
