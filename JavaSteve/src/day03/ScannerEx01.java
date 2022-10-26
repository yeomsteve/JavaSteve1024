package day03;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		System.out.println("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);
		System.out.println("입력 받은 문자는 "+ ch +" 입니다.");
		scan.close();
			
		
	}

}
