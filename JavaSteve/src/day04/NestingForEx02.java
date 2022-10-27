package day04;

public class NestingForEx02 {

	public static void main(String[] args) {
		int num = 2, i = 0, count = 0;		
		for(num=2;num<=100;num++) {
			count =0;
			if(num%i==0) { System.out.println(num);
		for(i=1,count=0;i<=num;i++) {
			if(num%i==0) {
				count++;} }
			if(count==2) {
				System.out.println(num);}
			}
		}

		}
}



