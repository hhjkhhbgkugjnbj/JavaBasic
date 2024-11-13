package j03_연산자;

import java.util.Scanner;

public class Operation5 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		String str = "안녕";
		System.out.println(str.length());
		
		/*
		 * pw
		 * 비밀번호가 8 ~ 16자리가 되어야함.
		 * 8 ~ 16 자리를 충족하면 "비밀번호가 확인되었습니다."
		 * 아니라면 "비밀번호 자릿수를 맞춰주세요."
		 * 비밀번호 미작성 시 "비밀번호를 입력하세요."
		 */		
		Scanner scanner = new Scanner(System.in);
		String pw;
		String result;
		pw = scanner.next();
		result = pw.length() == 0 ? "비밀번호를 입력하세요." 
		: pw.length() > 7 && pw.length() < 17 ? "비밀번호가 확인되었습니다." 
		: pw.length() < 8 || pw.length() > 16 ? "비밀번호 자릿수를 맞춰주세요"
		: "404";
		System.out.println(result);
	}
}
