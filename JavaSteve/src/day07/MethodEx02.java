package day07;

public class MethodEx02 {

	public static void main(String[] args) {
		//7단을 출력하는 코드를 작성하세요. 단, 메소드를 이용할것.
		int dan = 7;
		printMult1(dan);
		System.out.println("----------");
		printMult2(dan,1,5);
		System.out.println("---------");
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + multi(dan, i));
		}

		
		
	}

	private static void printMult2(int dan, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private static void printMult1(int dan) {
		// TODO Auto-generated method stub
		
	}

	/* 기능: 단이 주어지면 해당하는 단을 콘솔에 출력하는 메소드
	 * 매개변수: 단 = > 정수 => int num
	 * 리턴타입: 없음 => VOID
	 * 메소드명:mult1
	 *
	 * */
	public static void mult1(int num) {
		int i;
		for(i=1; i<=9; i++) {
			System.out.println(num + " x "+ i + " = " + num*i);}
	}
	/* 기능: 단과 시작정수,끝정수가 주어지면 해당 하는 단을 단 X 시작숫자에서 단X끝숫자까지 콘솔에 출력
	 * 매개변수: 단, 시작숫자, 끝숫자=> int num, int start, int end
	 * 리턴타입: 없음 => void
	 * 메소드명: mult2
	 * */
	public static void mult2(int num, int start, int end) {
		int i;
		for(i=start; i<=end; i++) {
			System.out.println(num + " x "+ i + " = " + num*i);}
	}
	/*기능: 두 정수가 주어지면 두 정수의 곱을 알려주는 메소드
	 * 매개변수 : 두정수=> int num1, int num2
	 * 리턴타입: 두 정수의 곱 =>  정수 => in t
	 * 메소드명 : multi
	 * 
	 * */
	public static int multi(int num1, int num2) {
		return num1*num2;
		
	}

}

