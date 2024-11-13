package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {

		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		Student student5 = new Student("홍길중");
		
		/*
		 * student1,2,3,4,5를 students라는 배열에 넣고
		 * 
		 * students배열을 studentSet이라는 Set에 넣기
		 * 
		 * 원하시는 메뉴를 선택하시오
		 * 1. 학생 전체 조회
		 * 2. 삭제
		 * 
		 * 1선택
		 * 학번: ~ 이름 : ~
		 * 학번: ~ 이름 : ~
		 * 학번: ~ 이름 : ~
		 * ...
		 * 2선택
		 * 삭제할 학생의 이름을 입력하시오: 홍길서
		 * 학번을 입력하시오: 20240002
		 * 학번이 올바르지 않습니다. or
		 * 삭제되었습니다.
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String name = null;
		int code = 0;
		
		Student[] students = { student1, student2, student3, student4, student5 };
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.addAll(Arrays.asList(students));
	
		System.out.println("원하시는 메뉴를 선택하시오.\n1. 학생 전체 조회\n2. 삭제");
		System.out.println(studentSet.iterator().next());
		num = scanner.nextInt();
		if(num == 1) {
			System.out.println("1선택");
			for(Student student : studentSet) {
				System.out.println("학번: " + student.getStudentCode() + "이름 : " + student.getName());
			}
		}else if(num == 2) {
			System.out.println("삭제할 학생의 이름을 입력하시오: ");
			scanner.nextLine();
			name = scanner.nextLine();
//			System.out.println(name);
			for(Student student : studentSet) {
				if(student.getName().equals(name)) {
					System.out.println("학번을 입력하시오");
					code = scanner.nextInt();
					
					if(student.getStudentCode() == code) {
						studentSet.remove(student);
						break;
					}else {
						System.out.println("학번이 올바르지 않습니다.");
					}
				}else {
					System.out.println("존재하지 않는 학생입니다.");
				}
			}
		}
	}

}
