package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAXNUMBER = 100; //final은 고정상수 무조건 초기화해야함
		final int MINNUMBER = 0;
		
		int number  = 10;
		
		number = 30;
		System.out.println("최댓값: " + MAXNUMBER);
		System.out.println("현재값: " + number);
		System.out.println("최솟값: " + MINNUMBER);
		/*
		 * 상수 : 변하지 않는 수
		 * 상수임을 표시하는 법 -> 자료형 앞에 final 적기
		 * 상수 표현법 -> 전부 다 대문자로 작성 -> 카멜이 안되니 스네이크로 작성
		 * 상수는 무조건 초기화 해줘야함.
		 */
		
		
	}

}
