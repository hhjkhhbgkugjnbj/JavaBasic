package j19_익명클래스.람다식;

public class Main2 {

	public static void main(String[] args) {
		
		//매개변수가 하나일 시 소괄호 생략가능
		
		MathTest mathTest = score -> {
				if(score < 0 || score > 100) {
					return "계산불가";
				}else if(score > 89) {
					return "A학점";
				}else if(score > 79) {
					return "B학점";
				}else if(score > 69) {
					return "C학점";
				}else if(score > 59) {
					return "D학점";
				}else {
					return "F학점";
				}
			};
		System.out.println(mathTest.test(65));
		
	}

}
