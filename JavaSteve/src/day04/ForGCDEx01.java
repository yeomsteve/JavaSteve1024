package day04;


public class ForGCDEx01 {

	public static void main(String[] args) {
		int i = 1 ;
		int num1 = 12;
		int num2 = 18;
		int gcd = 1;
			
		for (i=1;i<=num1;i++) {
			if (num1%i==0 && num2%i==0)	{
				gcd = i;
			}
		}
		System.out.println("최대공약수는 " + gcd);
	}

}
