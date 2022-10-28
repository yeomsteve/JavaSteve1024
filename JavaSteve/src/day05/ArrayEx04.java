package day05;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		/*학생 5명의 국어 성적(정수)을 입력받고 출력하는 코드를 작성하세요.
		 * */
		
		int score[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<score.length; i++) {
			System.out.print(i+1+"번째 학생의 국어 성적을 입력하세요 : ");
			score[i] = scan.nextInt();
			System.out.println(i+1+"번째 학생의 국어 성적을 입력하세요 : " + score[i]);
				
		}
		scan.close();
		
		int sum = 0;
		
		for (int i =0; i < score.length; i++) {
			sum += score[i];}
		double avg = (double)sum / score.length;
		
			System.out.println(avg);
			sum = 0;
			for(int tmp : score) {
				sum += tmp;
			
		}
			avg = (double)sum /score.length;
	}

}
