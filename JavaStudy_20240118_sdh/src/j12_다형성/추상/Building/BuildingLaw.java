package j12_다형성.추상.Building;


public abstract class BuildingLaw {

	public abstract void elevator();
	public abstract void fire();
	public abstract void step();
	
	public void toilet(){
		System.out.println("화장실 풍부하게 설계희망");
	}
}
