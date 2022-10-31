package day06;

import java.util.Scanner;

public class ArrayScoreEx01 {

	public static void main(String[] args) {
		/* 5명 학생의 국어, 영어, 수학 성적을 저장하기 위한 배열 생성후, Scanner를
		 * 생성하여 입력받아, 국어평균, 영어평균, 수학평균 구하는코드 작성하세요.*/
		int stdCount = 5;//stdCount=학생수
		int kor[] = new int[stdCount];//학생1의 성적,국,영,수
		int eng[] = new int[stdCount];
		int mat[] = new int[stdCount];
		
		//학생별 국,영,수 성적을 입력.
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ;i<stdCount ;i++ ) {
			System.out.print("학생"+(i+1)+ " 의 국어,영어,수학 성적을 입력하세요");
			kor[i] = scan.nextInt();
			eng[i] = scan.nextInt();
			mat[i] = scan.nextInt();
		}
		
		
		//과목별 합(총점)
		double korSum = 0, engSum = 0, matSum = 0;
		for(int i = 0; i<stdCount; i++) {
			korSum += kor[i];
			engSum += eng[i];
			matSum += mat[i];
		}
		
		//과목별 평균
		System.out.println("국어 성적의 평균:" + korSum/ stdCount);		
		System.out.println("영어 성적의 평균:" + engSum/ stdCount);	
		System.out.println("수학 성적의 평균:" + matSum/ stdCount);	
		
		
		double avg;
		avg = korSum/stdCount;
		//학생별 평균
		for(int i = 0; i<stdCount; i++) {
			double sum = kor[i]+eng[i]+mat[i];
			System.out.println("학생"+(i+1) + "의 평균: " + sum /3);			
		}
	}

}
