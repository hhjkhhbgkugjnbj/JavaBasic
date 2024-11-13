package j12_다형성.인터페이스2.ex;

public class OTTMiddleware {

	private OTT ott;
	
	public OTTMiddleware(OTT ott) {
		this.ott = ott;
	}
	
	public void OTTdrama() {
		System.out.println("드라마를 선택합니다.");
		ott.drama();
	}
	public void OTTmovie() {
		System.out.println("영화를 선택합니다.");
		ott.movie();
	}
	public void OTTanimation() {
		System.out.println("애니메이션을 선택합니다.");
		ott.animation();
	}
	public void OTTAddOn() {
		if(ott instanceof Netflix) {
			((Netflix) ott).sale();
		}else if(ott instanceof Tving) {
			((Tving) ott).bundle();
		}else if(ott instanceof Watcha) {
			((Watcha) ott).freetier();
		}
	}
}
