package day04;

public class NestingForEx01 {

	public static void main(String[] args) {
	
		int num = 3, i;
		for(num =2; num<=9; num++) {
			for(i=1;i<=9;i++) {
			System.out.println(num + " X " + i + " = " + (num*i) );
			}
		}
	}

}
