package j12_다형성.추상.Building;

public class BuildingMain {

	public static void main(String[] args) {

		BuildingLaw LotteTower = new LotteTower();
		BuildingLaw Lct = new LctLow();
		
		
		LotteTower.step();
		LotteTower.fire();
		
		Lct.elevator();
	}

}
