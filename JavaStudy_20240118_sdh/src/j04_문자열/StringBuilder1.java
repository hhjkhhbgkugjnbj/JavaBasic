package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		StringBuilder strBuilder2 = new StringBuilder();
		
		strBuilder.append("이름: ");
		strBuilder.append("홍길동");
		strBuilder.delete(1, 2); //1에서 2까지 자른다
		System.out.println(strBuilder);
		
		strBuilder2.append("hihi");
		System.out.println(strBuilder2);
	}

}
