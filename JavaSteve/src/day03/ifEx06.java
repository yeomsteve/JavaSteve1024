package day03;

import java.util.Scanner;

public class ifEx06 {

	public static void main(String[] args) {
		

	
	Scanner scan = new Scanner(System.in);
	char ch;
	ch = scan.next().charAt(0);
	scan.close();
	
	if (ch =='+' || ch =='-' || ch == '*' || ch == '/' ||ch == '%') {
		System.out.println(" is arithmatic operator");
	} else {
		System.out.println(" is not an arithmatic operator");
	}

}
}