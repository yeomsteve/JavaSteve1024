package day03;

import java.util.Scanner;

public class ifEx07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 문자를 입력하세요.");
		int num1 = scan.nextInt();
		char ch = scan.next().charAt(0);
		int num2 = scan.nextInt();
		scan.close();
		
		if (ch == '+') {
			System.out.println(num1+num2);
		}
		else if (ch == '-') {
			System.out.println(num1-num2);
		}
		else if (ch == '*') {
			System.out.println(num1*num2);
		}
		else if (ch == '/' ) {
			System.out.println((double)num1/(double)num2);
		}
		else
		{
			System.out.println("is not an arithmatic operator.");
		}
	}

}
