package j09_클래스;

import java.util.Scanner;

public class Car {
	Scanner scanner = new Scanner(System.in);
	String company;
	String model;
	String color;
	int changeKm; 
	int wishL;
	
	/*
	 * 생성자의 특징 
	 * 1. 주소값을 리턴한다.
	 * 2. 클래스명과 동일하다.
	 * * 기본 생성자는 생략이 가능하다.
	 */
	
	Car(){
		
	}
	
	void showCarInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
	}
	
	void changeEngileOil() {
		System.out.print("교체 후 주행거리 : ");
		changeKm = scanner.nextInt();
		scanner.nextLine();
		System.out.print("희망 주입량(L) : ");
		wishL = scanner.nextInt();
		
		if(changeKm < 9000) {
			System.out.println("9,000km 주행 후 교체 하십시오.");
			
		}else {
			if(wishL > 5) {
				System.out.println("희망 주입량이 5L 이상이므로 5L만 주입합니다.");
			}else {
				System.out.println(wishL + "L 를 교체합니다.");
			}
		}
	}
}
