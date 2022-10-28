package day05;

import java.util.Scanner;

public class ForUpDownEx01 {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int num = min - 1;
		Scanner scan = new Scanner(System.in);
		
		/*랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하세요.*/
		/*wrong code*/
		int r = (int)(Math.random()*(max - min + 1)+min);
		
		System.out.print("숫자를 입력하세요");
		int c;
		c = scan.nextInt();
		
		for ( ;r!=num; ) {
			System.out.print("UP");
			num = scan.nextInt();
			if (num == r) {
				System.out.println("정답입니다.");						
			}else if(num > r) {
				System.out.print("DOWN");
			
			}else {
				System.out.print("정답입니다.");
				
			}
		}
	}

}
