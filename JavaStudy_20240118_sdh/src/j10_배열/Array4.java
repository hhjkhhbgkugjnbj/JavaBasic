package j10_배열;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
//		
//		int[] numbers = {4,3,2,1};
//		
//		printArray(numbers);
		
		/*
		 * Arrays : [4,3,2,1]
		 * 
		 * 
		 * * printArray라는 메소드를 Array4클래스 내부에 만들어서 사용해보자
		 * 
		 */
		
		/* Arrays 클래스 사용법 
		 *  - 배열을 관리해주는 객체 
		 *  
		 * 1) 배열의 내용을 검색 후 인덱스를 반환받는 방법
		 *  - binarySearch()
		 *  
		 * 2) 배열을 복사할 때 사용하는 메소드 (깊은 복사)
		 *  - copyOf(복사하고자 하는 배열, 새로 생성할 배열의 크기)
		 * 
		 * 3) 배열을 복사할 때 원하는 범위만 복사해주는 메소드 
		 *  - copyOfRange(복사하고자 하는 배열, 시작 인덱스, 마지막 인덱스)
		 * 
		 * 4) 배열을 초기화하고 원하는 값으로 모두 채우는 메소드 
		 *  - fill(초기화하고자 하는 배열, 채울 값)
		 * 
		 * 5) 배열을 정렬하는 방법
		 *	- sort(정렬하고자 하는 배열)
		 * 
		 */
		
		//배열 만들기
		//얕은 복사 - 주소가 같다 
		int[] numbers1 = {1,6,2,3,3,4,5,6,9};
		int[] numbers2 = numbers1;
		
		printArray(numbers1);
		printArray(numbers2);
		
		//깊은 복사
		int[] numbers3 = new int[numbers1.length];
		for(int i = 0; i < numbers3.length; i++) {
			numbers3[i] = numbers1[i];
		}
		numbers1[0] = 4;
		printArray(numbers3);
		System.out.println(numbers1);
		System.out.println(numbers3);
		
		int[] numbers4 = Arrays.copyOf(numbers1,numbers1.length);
		
		numbers1[0] = 5;
		printArray(numbers4);
		
		//범위 지정하여 copy
		int[] numbers5 = Arrays.copyOfRange(numbers1, 1, 3);
		printArray(numbers5);
		
		Arrays.fill(numbers5, 10);
		printArray(numbers5);
		
		int index = Arrays.binarySearch(numbers1, 5);
		System.out.println("찾은 인덱스: " + index );
	}
	private static void printArray(int[] arr) {
		System.out.print("Array : [");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
