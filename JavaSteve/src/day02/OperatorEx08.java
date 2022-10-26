package day02;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		boolean isEven = num % 2 == 0;
		String result = isEven ? "짝수" : "홀수";
		System.out.print(num +  "is"  + result + "입니다." );
		scan.close();
		
	}

}