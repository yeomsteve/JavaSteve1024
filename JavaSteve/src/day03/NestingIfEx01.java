package day03;

public class NestingIfEx01 {

	public static void main(String[] args) {
		int num = 6;
		
		if(num % 2 == 0) {
			if(num % 3 ==0) {
				System.out.println(num + " is multiple of 6");
			}
			else {
				System.out.println(num + " is multiple of 2");
			}
		   }else if(num % 3 == 0) {
				System.out.println(num + " is multiple of 3");
			}
			else {
				System.out.println(num + " is not multiple of 2,3,6");
			}
		}
	
	}


