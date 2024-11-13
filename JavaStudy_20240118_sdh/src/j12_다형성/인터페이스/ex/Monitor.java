package j12_다형성.인터페이스.ex;

public class Monitor implements HDMI {
	 @Override
	public void connect() {
		 System.out.println("HDMI를 통해 모니터를 연결합니다.");
	}
	 
	 @Override
	public void disconect() {
		 System.out.println("HDMI에 모니터연결을 해제합니다.");
	}
	
}
