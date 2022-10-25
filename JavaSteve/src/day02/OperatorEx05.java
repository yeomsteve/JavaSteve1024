package day02;
import java.util.Scanner;
public class OperatorEx05 {

	public static void main(String[] args) {
		int kor, eng, math, sum;
		double avg;

		Scanner scan = new Scanner(System.in);
	
				
		System.out.println("국어성적입력:");
		kor = scan.nextInt();
		System.out.println("영어성적입력:");
		eng = scan.nextInt();
		System.out.println("수학성적입력:");
		math = scan.nextInt();
		scan.close();
		
		sum = kor + eng + math;
		avg = ((double)sum)/3;
		
		System.out.println("평균 : " + avg);
		
		boolean isPass = avg >= 60;
		boolean isFail = avg < 60;
		
		System.out.println("통과입니까? :" + isPass);
		System.out.println("통과입니까? :" + !isFail);
	
	}
	

}
