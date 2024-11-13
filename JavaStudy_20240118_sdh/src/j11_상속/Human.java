package j11_상속;

public class Human extends Animal {
	
	public Human() {
		super(); // 부모를 가리킨다.
		System.out.println("Human 생성자 호출");
	}

//	public void move() {
//		System.out.println("동물이 움직입니다.");
//	}
	public void handling() {
		System.out.println("도구를 사용합니다.");
	}
	
	//오버라이딩 : 재정의 
	@Override
	public void move() {
		super.move();
		System.out.println("딸 피아노 고수");
	}
}
