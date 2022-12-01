package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	
	private static Scanner scan = new Scanner(System.in);
	private static List<Board> boardList = new ArrayList<Board>(); 
	public static void main(String[] args) {
		/* 기능
		 * 	- 게시글 등록
		 *  - 게시글 수정
		 * 	- 게시글 삭제
		 * 	- 게시글 목록
		 * 	- 게시글 확인
		 * 		-댓글 등록
		 * 		-댓글 확인
		 * 		-이전
		 * 	- 프로그램 종료		 * 
		 * */
		//메뉴를 출력하고, 메뉴가 프로그램 종료가 아니면 반복하는 코드를 작성
		
		
		int menu = -1;
		do {
		printmenu();		
		menu = scan.nextInt();
		scan.nextLine();
		runMenu(menu);
		
		}while(menu != 6);
	}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1: insertBoard(); 	break;
		case 2:  updateBoard(); System.out.println("게시글 수정");
			break;
		case 3: deleteBoard(); System.out.println("게시글 삭제");
			break;
		case 4:System.out.println("게시글 목록");
			break;
		case 5: System.out.println("게시글 확인");
			break;
		case 6: System.out.println("프로그램을 종료합니다");
			break;
		default:	System.out.println("잘못 선택했습니다.");
		}
	}
		
	
	private static void deleteBoard() {
		// TODO Auto-generated method stub
		
	}
	private static void updateBoard() {
		// TODO Auto-generated method stub
		
	}
	private static void insertBoard() {
			//게시글 정보 입력
			System.out.println("번호 : ");
			int num = scan.nextInt();
			scan.nextLine();
			System.out.println("제목 : ");
			String title = scan.nextLine();
			System.out.println("내용 : ");
			String contents = scan.nextLine();
			System.out.println("작성자 : ");
			String writer = scan.nextLine();
			//게시글 객체 생성
			Board board = new Board(num, title, contents, writer);
		
			//번호 중복 확인
			if(boardList.contains(board)) {
				System.out.println("이미 등록된 게시글 번호입니다.");
			}
			//게시글 리스트에 추가
			boardList.add(board);
			System.out.println(boardList);
		
	}
	/*메뉴를 출력하는 메소드*/

	private static void printmenu() {
		System.out.println("메뉴");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 목록");
		System.out.println("5. 게시글 확인");
		System.out.println("6. 프로그램 종료");
		System.out.println("메뉴 선택: ");
		
	}
}
	
