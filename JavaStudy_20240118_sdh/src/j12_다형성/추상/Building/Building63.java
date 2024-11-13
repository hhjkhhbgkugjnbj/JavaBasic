package j12_다형성.추상.Building;

public class Building63 extends BuildingLaw {
	
	@Override
	public void elevator() {

		System.out.println("63빌딩 엘리베이터");
	}
	@Override
	public void fire() {
		System.out.println("63빌딩 화재경보");
	}
	@Override
	public void step() {
		System.out.println("63빌딩 피난용계단");
		
	}
	
	public void aquaium() {
		System.out.println("63빌딩 아쿠아리움 good");
	}
}
