package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * 반복문을 돌려 출력
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 */
		String str = "abcdefghijk";
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i,i + 1));
		}
	}

}
