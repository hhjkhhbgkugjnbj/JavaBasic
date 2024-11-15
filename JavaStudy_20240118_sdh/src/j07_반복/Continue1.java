package j07_반복;

public class Continue1 {

	public static void main(String[] args) {

		// 0부터 9까지 출력하는 반복문 작성
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수");
			}
			System.out.println(i);
		}
		System.out.println();

		/*
		 * continue를 사용하여 1부터 129까지의 수 중 홀수의 합을 구하시오
		 */
		int sum = 0;
		for (int i = 0; i < 130; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
//		System.out.println("홀수의 합: " + sum);
		
		//while 풀이
		int k = 0;
		int total = 0;
		while(k < 130) {
			if(k % 2 == 0) {
				k++;
				continue;
			}
			total += k;
			k++;
		}
		System.out.println("홀수의 합: " + total);
	}

}
