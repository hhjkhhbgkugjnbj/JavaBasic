package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		
		Factory[] factories = new Factory[6];
		factories[0] = new SamsungFactory(1);
		factories[1] = new SamsungFactory(2);
		factories[2] = new LGFactory(1);
		factories[3] = new SamsungFactory(3);
		factories[4] = new LGFactory(2);
		factories[5] = new LGFactory(3);
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			
			if(factories[i] instanceof SamsungFactory) {
				((SamsungFactory)factories[i]).produceSmartPhone();
			}else if(factories[i] instanceof LGFactory) {
				((LGFactory)factories[i]).produceSmartTV();
			}else {
				System.out.println("다운 안됨.");
			}
			
			factories[i].stop();
		}
//		Factory factory = new SamsungFactory(3);
//		Factory factory2 = new LGFactory(3);
//		
//		System.out.println(factory instanceof SamsungFactory);
//		System.out.println(factory2 instanceof SamsungFactory);
		
		/*
		 * 공장 6개(팩토리 배열)
		 * 삼성1
		 * 삼성2
		 * 엘지1
		 * 삼성3
		 * 엘지2
		 * 엘지3
		 * 
		 * 가동-생산-중지
		 * 삼성1공장을 가동합니다.
		 * 스마트폰 생산
		 * 삼성1공장을 중지합니다.
		 * 
		 * 삼성2공장을 가동합니다.
		 * 스마트폰 생산
		 * 삼성2공장을 중지합니다.ㅣ
		 * 
		 * 엘지1공장을 가동합니다.
		 * 스마트TV 생산
		 * 엘지1공장을 중지합니다.
		 * 
		 * ...
		 */
	}

}
