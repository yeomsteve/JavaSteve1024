package day04;

public class ForPrimeNumberEx01 {

	public static void main(String[] args) {
		int num = 1, i, count;
		for(i=1, count=0;i<=num;i++) {
			if(num%i==0) { count++;
				}			
		      }  if (count == 2) { 
		   	System.out.println(num + " 은 소수");
		    }
		    else {
			System.out.println(num +" 은 소수가아님");

		}
		
	}

}
