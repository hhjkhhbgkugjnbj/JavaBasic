package j12_다형성.추상.Building;

public abstract class Lct extends BuildingLaw {
	
	@Override
	public void fire() {
		System.out.println("엘시티 화재경보");
		
	}@Override
	public void step() {

		System.out.println("엘시티 피난용 계단");
	}
	
	public void waterPark() {
		System.out.println("엘시티 워터파크");
	}
}
