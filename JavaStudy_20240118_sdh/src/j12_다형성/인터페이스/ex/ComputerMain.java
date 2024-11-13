package j12_다형성.인터페이스.ex;

public class ComputerMain {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		Computer computer = new Computer(monitor);
		
		computer.powerOn();
		System.out.println();
		computer.powerOff();
	}

}
