package j04_문자열;

public class String2 {

	public static void main(String[] args) {

		String address = "부산광역시 서구 부민동";
		System.out.println(address.replace(" ", "-"));
		
		String address2 = "부산광역시 연제구 연산동";
		String replaceAddress = address2.replaceAll(" 연", "홍");
		System.out.println(replaceAddress);
		/*
		 * 01033004698
		 *  -> 비밀번호 저장완료
		 *  
		 *  010-3300-4698
		 *  -> 01033004698 비밀번호 저장완료
		 *  
		 *  010/3300/4698
		 *  -> 01033004698 비밀번호 저장완료
		 *  
		 *  010-3300-466987
		 *  -> 비밀번호가 올바르지 않습니다.
		 *  
		 *  삼항연산자, replace 등을 사용
		 */
		
		String phonenumber = "010-3300-4698";
		String result = phonenumber.length() == 11 ? "번호 저장완료" 
		: phonenumber.length() != 13 ? "번호가 올바르지 않습니다." 
		: phonenumber.replaceAll("/", "").replaceAll("-", "");
		String fixedPhoneNumber = phonenumber == "01033004698" ? "비밀번호 저장완료" 
		: phonenumber.replaceAll("-", "") == "01033004698" ? "비밀번호 저장완료"  
		: phonenumber.replaceAll("/", "") == "01033004698" ? "비밀번호 저장완료" 
		: phonenumber.replace("/", "").length() != 11 || phonenumber.replace("-", "").length() != 11 ? "비밀번호가 올바르지 않습니다." 
		: "404"; 
		System.out.println(fixedPhoneNumber);
		
		String phoneNumber2 = "010/3300/4698, 010/1234/5678";
		//011-3300-4698 / 011-1234-5678
		phoneNumber2 = phoneNumber2.replaceAll("/", "-").replaceAll(", "," / " ).replaceAll("010", "011");
		System.out.println(phoneNumber2);
				}

}
