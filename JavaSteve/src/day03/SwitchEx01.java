package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		int num = 1;
		switch(num%2) {
		case 0:
			System.out.println(num + " is an even number.");
			break;
		default:
				System.out.println(num + " is an odd number.");
		}

	}

}
