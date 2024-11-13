package j11_상속.factory;

public class Factory {

	public int factoryNumber;

	public Factory(int factoryNumber) {
		this.factoryNumber = factoryNumber;
		
	}
	
	public void start() {
		System.out.println(this.factoryNumber + "공장을 가동합니다.");
		
	}
	public void stop() {
		System.out.println(this.factoryNumber + "공장을 중지합니다.");
	}
}
