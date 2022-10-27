package day04;

public class NestingForStarEx02 {

	public static void main(String[] args) {
		int col;
		int row;
		
		for(row =1; row<=5; row++) {
			for(col =1; col<=5-row; col++) {
				System.out.print(" ");				
			}
			for(col =1; col<=row; col++) {
				System.out.print("*");				
			}for(col =1; col<=row-1; col++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
}


