package day03;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		//ifEx06를 switch문으로 변경
		char ch = '-';
		switch(ch) {
		case '+', '-', '*', '%':
			System.out.println(ch +  " is an arithmatic operator.");
			break;
		default:
			System.out.println(ch + " is not an arithmatic operator.");
		}

	}

}
