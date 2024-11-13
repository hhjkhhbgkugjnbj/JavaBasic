package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		
		SamsungFactory samsungFactory = new SamsungFactory(1);
		Factory sfactory = samsungFactory;
		SamsungFactory samsungFactory2 = (SamsungFactory)sfactory;
		
//		Factory factory = new Factory(1);
//		LGFactory lgFactory = (LGFactory)factory;
		// 근본 주소로 내려오는건 가능, 부모주소에서 자식주소 못 내려옴
		// 밑에서 위로 갔다가 내려오는건 가능, 그냥 위에서 아래는 불가
		
	}

}
