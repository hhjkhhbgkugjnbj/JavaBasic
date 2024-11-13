package j12_다형성.인터페이스2.ex;

public class Watcha implements OTT {

	@Override
	public void drama() {
		System.out.println("왓챠에서 드라마를 시청합니다.");
	}
	
	@Override
	public void movie() {
		System.out.println("왓챠에서 영화를 시청합니다.");
	}
	
	@Override
	public void animation() {
		System.out.println("왓챠에서 애니메이션을 시청합니다.");
		
	}
	public void freetier() {
		System.out.println("왓챠에서 2주 무료시청을 제공합니다.");
	}
}
