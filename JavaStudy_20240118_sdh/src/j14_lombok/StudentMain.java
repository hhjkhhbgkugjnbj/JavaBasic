package j14_lombok;

public class StudentMain {

	public static void main(String[] args) {

		//Student student = new Student();
		//Student student2 = new Student(20240001, "홍길동", 3, 18);
		
		//System.out.println(student2.getName());
		//System.out.println(student2.getAge());
		
		//System.out.println(student2);
		Student student = new Student(0, "홍길동",18, 0);
		System.out.println(student.getAge());
		
	}

}
