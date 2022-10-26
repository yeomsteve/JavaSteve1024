package day03;

import java.util.Scanner;

public class ifEx08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("punch in the score.");
		int num = scan.nextInt();
	
		scan.close();
				
		if (num >100 || num<0) {
			System.out.println("Wrong input");
		}
		else if (num>=90) {
			System.out.println("Your grade is A");
		}
		else if (num>=80) {
			System.out.println("Your grade is B");
			}
		else if (num>=70) {
			System.out.println("Your grade is C");
		}
		else if (num>=60) {
			System.out.println("Your grade is D");
		}
		else {System.out.println("Your grade is F");
	
	}
	}
}
