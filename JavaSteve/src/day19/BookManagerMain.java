package day19;

import java.util.ArrayList;
import java.util.Scanner;

import day16.Member1;

public class BookManagerMain {
	

	public static void main(String[] args) {
		/*도서 관리 프로그램
		 * 도서 정보 - 도서명, 저자(여러명, 엮은이, 옮긴이 다 포함), 가격, 출판사, 분류,ISBN
		 * 			title, author,price,publisher,sort,ISBN
		 * 기능
		 * - 도서 추가
		 * 		-ISBN으로 정렬(1,2,3,4...)
		 * - 도서 조회
		 * 		- 도서명으로 조회
		 * 		- 저자로 조회
		 * 		- 출판사로 조회
		 * 		- 분류로 조회
		 * */
		int menu = -1;
		ArrayList<String> bookList = new ArrayList<String>();
		do {
			//메뉴
			printMenu();			
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			switch(menu){
			case 1:
				if(menu ==1) {
					addBook(bookList);
				
				}
				break;
			case 2:
				if(menu == 2) {
				System.out.println("도서 조회");
				
				}
				break;
			case 3:
				if(menu == 3) {
				System.out.println(" 프로그램 종료");
				}
				break;
			default:	
					System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 3);	
		
	}
	private static void printMenu() {
		System.out.println("-------메뉴-------");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("메뉴 선택 : ");
		
		
	}
	public static void addBook(ArrayList<String> bookList ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("도서 추가:");
		String title = scan.next();
		bookList.add(title);	
		
		System.out.println("도서가 추가 되었습니다.");
		
		System.out.println(bookList);
		
	}
	
/* 기능
 * 매개변수
 * 리턴타입
 * 메소드명
 * */
}
