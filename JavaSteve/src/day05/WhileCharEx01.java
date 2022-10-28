package day05;

import java.util.Scanner;

public class WhileCharEx01 {

	public static void main(String[] args) {
		char ch;		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력하세요 (종료 : q) : ");
			ch = scan.next().charAt(0);
			if(ch == 'q') {
				System.out.println("종료");
				break;
			}
			
			}
		scan.close();
		
	}

}
