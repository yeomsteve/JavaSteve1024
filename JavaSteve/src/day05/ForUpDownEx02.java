package day05;

import java.util.Scanner;

public class ForUpDownEx02 {

	public static void main(String[] args) {
		/*랜덤한 정수를 맞추는 up down 게임
		*/	
		//랜덤한수 생성//
		
		int min = 1, max = 100;
		int r, num;
		Scanner scan = new Scanner(System.in);
		
		
	
		
		System.out.println("숫자를 입력하세요 :");
		num = scan.nextInt();
		
		
		for ( ; ; ) {
			 r = (int)(Math.random()*(max - min + 1)+min);
			 System.out.println(min + " ~ " + max + "사이의 랜덤한 수를 맞추세요.");
			 num = min -1;
			 for( ; r != num ;) {
			System.out.print("숫자입력");
			num = scan.nextInt();
			if (num == r) {
				System.out.println("정답입니다.");						
			}else if(num > r) {
				System.out.print("DOWN");
			
			}else {
				System.out.print("UP");
				
		}
		System.out.print("더 하시겠습니까?(y/n) : ");
		if ( scan.next().charAt(0) == 'n') {
			break;
		}
		
}System.out.println("프로그램 종료");
scan.close();
	}
}
	}