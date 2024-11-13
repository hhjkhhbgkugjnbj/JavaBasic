package j12_다형성.인터페이스.ex;

public class Computer {

	private HDMI hdmi;
	public Computer(HDMI hdmi) {
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		System.out.println("컴퓨터를 킵니다.");
		connect();
	}
	
	public void powerOff() {
		disconnect();
		System.out.println("컴퓨터를 끕니다.");
	}
	
	public void connect() {
		System.out.println("출력장치를 연결합니다.");
		hdmi.connect();
	}
	
	public void disconnect() {
		System.out.println("출력장치 연결을 해제합니다.");
		hdmi.disconect();
	}
}
