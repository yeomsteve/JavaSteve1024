package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("punch in two numbers and arithmatic operator");
		int num1 = scan.nextInt();
		char ch = scan.next().charAt(0);
		int num2 = scan.nextInt();
		scan.close();
		
	switch (ch) {
	case '+': 
		System.out.println(num1+num2);
		break;
	case '-':
		System.out.println(num1-num2);
		break;
	case '*':
		
		System.out.println(num1*num2);
		break;
	case '/':
		System.out.println(num1/num2);
		break;
	case '%':
		System.out.println(num1%num2);
		break;
	default:
		System.out.println("is not an arithmatic operator");
	}

	}

}
