package j09_클래스.생성자;

public class Constructor1 {
	
	String name;
	int age;
	
	// 값주입 방법2
	// 기본 생성자
	// NoArgsConstructor
	public Constructor1() {
		System.out.println("기본 생성자");
		
	}
	
	// RequiredArgsConstructor
	public Constructor1(String name) {
		System.out.println("매개변수: " + name);
		System.out.println("name를 매개변수로 받는 생성자");
		System.out.println(this);
		this.name = name;
	}
	
	// RequiredArgsConstructor
	public Constructor1(int age) {
		System.out.println("매개변수: " + age);
		System.out.println("age를 매개변수로 받는 생성자");
		this.age = age;
	}
	
	// 전체 생성자
	// AllArgsConstructor
	public Constructor1(String name,int age) {
		System.out.println("매개변수: " + name);
		System.out.println("매개변수: " + age);
		System.out.println("전체생성자 생성자");
		this.name = name;
		this.age = age;
		
	}
	
	// Args -> Arguments(인수, 매개변수)
}
