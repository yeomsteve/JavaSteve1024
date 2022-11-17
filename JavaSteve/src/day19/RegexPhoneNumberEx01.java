package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPhoneNumberEx01 {

	public static void main(String[] args) {
		/*전화번호 정규표현식을 작성하여 입력받은 번호가 전화번호가 맞는지 출력하는 코드
		 * 010-xxxx-xxxx(O)
		 * 010xxxxxxxx(X)
		 * 011-xxxx-xxxx(X)
		 * 010(-\d{4}){2}
		 * */
		
		String regex = "010(-\\d{4}){2}";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(Pattern.matches(regex, str)) {
			System.out.println(str+ "은 폰번호 형식입니다.");
		}else {
			System.out.println("은 폰번호 형식이 아닙니다.");
		}
		scan.close();

	}

}
