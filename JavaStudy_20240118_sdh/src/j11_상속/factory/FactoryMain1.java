package j11_상속.factory;

public class FactoryMain1 {

	public static void main(String[] args) {
		
		/*
		 * 삼성팩토리 배열(크기: 5)
		 * 1공장 ~ 5공장
		 * 
		 * 엘지팩토리 배열(크기: 3)
		 * 1공장 ~ 3공장
		 * 
		 * 삼성공장가동
		 * 1공장을 가동합니다.
		 * ...
		 * 5공장을 가동합니다.
		 * 
		 * 삼성공장중지
		 * 1공장을 중지합니다.
		 * ...
		 * 5공장을 중지합니다.
		 * 
		 * 엘지공장가동
		 * ...
		 * 
		 * 엘지공장 중지
		 * ...
		 */
		SamsungFactory[] samsungFactory = new SamsungFactory[5];
		LGFactory[] lgFactory = new LGFactory[3];

		for(int i = 0; i < samsungFactory.length; i++) {
			samsungFactory[i] = new SamsungFactory(i);
		}
		
		for(int i = 0; i < lgFactory.length; i++) {
			lgFactory[i] = new LGFactory(i);
		}
		System.out.println("삼성공장가동");
		
		for(int i = 0; i < samsungFactory.length; i++) {
			Factory factory = new Factory(i + 1);
			factory.start();
		}
		System.out.println("삼성공장중지");
		for(int i = 0; i < samsungFactory.length; i++) {
			Factory factory = new Factory(i + 1);
			factory.stop();
		}
		System.out.println("엘지공장가동");
		for(int i = 0; i < lgFactory.length; i++) {
			Factory factory = new Factory(i + 1);
			factory.start();
		}		
		System.out.println("엘지공장중지");
		for(int i = 0; i < lgFactory.length; i++) {
			Factory factory = new Factory(i + 1);
			factory.stop();
		}
	}

}
