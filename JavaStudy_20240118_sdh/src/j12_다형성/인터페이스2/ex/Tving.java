package j12_다형성.인터페이스2.ex;

public class Tving implements OTT {

	@Override
	public void drama() {
		System.out.println("티빙에서 드라마를 시청합니다.");
	}
	
	@Override
	public void movie() {
		System.out.println("티빙에서 영화를 시청합니다.");
	}
	
	@Override
	public void animation() {
		System.out.println("티빙에서 애니메이션을 시청합니다.");
	}
	
	public void bundle() {
		System.out.println("티빙에서는 1 + 1입니다.");
	}
}
