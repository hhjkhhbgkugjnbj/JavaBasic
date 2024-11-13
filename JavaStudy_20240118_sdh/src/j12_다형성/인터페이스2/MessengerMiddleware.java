package j12_다형성.인터페이스2;

public class MessengerMiddleware {
	
	private Messenger messenger;

	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessage() {
		messenger.send();
	}
	
	public void receiveMessage() {
		messenger.receive();
	}
	public void runAddOns() {
		if(messenger instanceof KakaoTalk) {
			((KakaoTalk)messenger).sendPresent();
		}else if(messenger instanceof Instagram) {
			((Instagram)messenger).sendStory();
		}
		
	}
}
