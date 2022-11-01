package day07;

public class MethodEx03 {

	public static void main(String[] args) {
	printPrimeNumber(10);
	System.out.println(isPrimeNumber(10));
	}
		/* 주어진 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 단, 메소드를 이용할것.
		 */
	/*기능  두정수가 소수인지 아닌지 판별
	 * 매개변수 int num, int i, int count
	 * 리턴타입 int
	 * 메소드명 primeNumber
	 * */
	
	/*기능: 정수가 주어지면 소수인지 아닌지 출력하는 메소드
	 * 매개변수 : 정수 => int num
	 * 리턴타입: 출력(void)
	 * 메소드명: printPrimeNumber
	 * */
	
	/*기능: 정수가 주어지면 소수인지 안인지 알려주는 메소드
	 * 매개변수 : 정수 => int num
	 * 리턴타입: 소수인지 아닌지 => boolean
	 * 메소드명: isPrimeNumber
	 * */
	public static void printPrimeNumber(int num) {
		int i , count;
			for(i=1, count=0;i<=num;i++) {
			if(num%i==0) { 
				count++;
			}			
		}  
		if (count == 2) { 
		   	System.out.println(num + " 은 소수");
		}
		else {
			System.out.println(num +" 은 소수가아님");}
		}

	
	
	
		public static boolean isPrimeNumber(int num) {
			
			for(int i = 2; i<num; i++) {
				//1과 num을 제외한 약수
				if(num%i ==0) {
					return false;
				}
			}
			return num <= 1 ? false : true;
		
	}
}
