package j12_다형성.인터페이스;

public class ComputerMain {

	public static void main(String[] args) {
		
		Bluetooth bluetooth = new Mouse();
		Monitor monitor = new Monitor();
		Computer computer = new Computer(monitor);
		computer.setBluetooth(bluetooth);
	
		computer.powerOn();
		
		System.out.println();
		computer.powerOff();
	}

}
