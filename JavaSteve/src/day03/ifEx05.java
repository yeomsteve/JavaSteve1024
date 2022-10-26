package day03;

public class ifEx05 {

	public static void main(String[] args) {
		int num = 1;
		if (num % 2 == 0 && num % 3 != 0) {
			System.out.println(num + " is multiple of 2");
		} else if (num % 3 == 0 && num % 2 != 0) {
			System.out.println(num + " is multiple of 3");
		}
		else {
			System.out.println(num + " is not multiple of 2,3,6");
		}
		
		if(num %6==0){
			System.out.println(num + " is multiple of 6");
		}else if(num %3 == 0) {
			System.out.println("is multiple of 3");}
		
			else if (num %2 == 0) {
				System.out.println("is multiple of 2");
			}
			else {
				System.out.println("is not multiple of 2,3,6");
			}
		}
	
	}


