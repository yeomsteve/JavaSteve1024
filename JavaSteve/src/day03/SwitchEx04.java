package day03;

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which month?");
		int num = scan.nextInt();
		scan.close();
		
		switch (num) {
		
		case 1,3,5,7,8,10,12:
			System.out.println("the last day of the month is 31");
			break;
		case 4,6,9,11:
			System.out.println("the last day of the month is 30");
			break;
		case 2:
			System.out.println("the last day of the month is 28");
			break;				
		default:
			System.out.println("Wrong month");
		}
		

	}

}
