package day18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEx01 {
//정규표현식 regular expression
	public static void main(String[] args) {
		String regex = "^...$";
				Scanner scan = new Scanner(System.in);
				String str = scan.next();
				boolean res = Pattern.matches(regex, str);
				if(res)
					System.out.println(str + "는 3글자로 되어있습니다.");
				else
					System.out.println(str + "는 3글자가 아닙니다.");
				scan.close();
	}

}

/*
 * 메타문자
특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 언어
\d : 숫자
\s : 공백 & 탭
\w : 영문 + 숫자
[문자들] : 해당 문자들만 허용
[a-zA-Z0-9] : \w와 같음
[가-힣] : 모든 한글
+ : 1이상 무한대 이하
[a-z]+ : 소문자가 1개이상 무한대
? : 0 또는 1개
* : 0개 이상
^
문장 처음에 위치 : 문장의 시작
중간에 위치 : Not
$ : 문장의 가장 끝
{min, max} : 반복 횟수
[a-z]{1,3} : 소문자가 1개이상 3개이하
() : 하나의 패턴 구분자 안에 서브 패턴을 지정해서 사용할 경우*/
 