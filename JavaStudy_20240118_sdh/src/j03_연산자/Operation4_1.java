package j03_연산자;

public class Operation4_1 {

	public static void main(String[] args) {
		/*
		 * 윤년 : 해당 년도가 4의 배수이고, 100의 배수가 아니거나 400의
		 *        배수일 때
		 *        
		 * 2024
		 * 2030
		 */
		
		int year = 2024;
		String result;
		
		result = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ) ? "윤년" : "윤년아님" ;
		
		System.out.println(result);
		
	}

}
