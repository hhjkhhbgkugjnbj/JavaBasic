package j12_다형성.인터페이스2.ex;

public class Netflix implements OTT {

	 @Override
	public void drama() {
		 System.out.println("넷플릭스에서 드라마를 시청합니다.");
	}
	 
	 @Override
	public void movie() {
		 System.out.println("넷플릭스에서 영화를 시청합니다.");
	}
	 
	 @Override
	public void animation() {
		 System.out.println("넷플릭스에서 애니메이션을 시청합니다.");		
	}
	 
	 public void sale() {
		 System.out.println("넷플릭스에서 20프로 세일을 합니다.");
	 }
}
