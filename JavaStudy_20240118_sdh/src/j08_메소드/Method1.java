package j08_메소드;

public class Method1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(sum);
	}

	public static int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
}
