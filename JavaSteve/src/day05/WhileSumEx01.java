package day05;

public class WhileSumEx01 {

	public static void main(String[] args) {
	
		int i = 0, sum = 0;
		
		while(++i<=10) {
			if(i%2 !=0) {
				sum += i;
				
			}
		
		}
		System.out.println("1~10까지 홀수의합 : " + sum);
	}

}
