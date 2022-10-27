package day04;

import java.util.Scanner;

public class ForCharEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch ='a';
		for( ; ch != 'q' ;) {
			System.out.print("문자를 입력하세요");
			ch = scan.next().charAt(0);
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
