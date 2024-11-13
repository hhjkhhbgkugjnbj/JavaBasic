package j12_다형성.인터페이스2.ex;

public class OTTMain {

	public static void main(String[] args) {
		
		Netflix netflix = new Netflix();
		Tving tving = new Tving();
		Watcha watcha = new Watcha();
		
		OTTMiddleware ottMiddleware = new OTTMiddleware(tving);
		
		ottMiddleware.OTTdrama();
		System.out.println();
		ottMiddleware.OTTmovie();
		System.out.println();
		ottMiddleware.OTTanimation();
		System.out.println();
		ottMiddleware.OTTAddOn();
	}

}
