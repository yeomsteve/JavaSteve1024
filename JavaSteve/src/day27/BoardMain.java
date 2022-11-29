package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	
	/*게시글 관리 프로그램
	 * - 회원가입
	 * 	-처음 가입한 회원이 관리자, 그외 회원은 일반회원
	 * - 로그인
	 * - 게시글 등록/수정/삭제 => 회원만 가능
	 * - 카테고리 관리(공지, 자유)
	 * - 카테고리 추가/수정/삭제(관리자만 가능) 
	 * */
	
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Member member = new Member();
		int menu = -1;
		do {
			printMenu();
			menu = scan.nextInt();
			scan.nextLine();
			runMenu(menu);
			
		}while(menu != 6);
		scan.close();
	}

	private static void runMenu(int menu, String Member) {
			String id,pw;

		switch(menu) {
		case 1:
			System.out.println("회원가입");
			System.out.println("원하는 아이디 입력: ");
			id = scan.nextLine();
			System.out.println("원하는 비밀번호 입력: ");
			pw = scan.nextLine();
			//처음가입한회원 = 관리자
			//그후로 일반회원
			break;
		case 2:
			System.out.println("로그인");
			System.out.println("아이디 입력: ");
			id = scan.nextLine();
			System.out.println("비밀번호 입력: ");
			pw = scan.nextLine();
			//아이디 
			//비번
			//틀리면 다시묻기
			break;
		case 3:
			System.out.println("게시글");
			//게시글 등록
			//게시글 수정
			//게시글 삭제
			break;
		case 4:
			System.out.println("카테고리 관리");
			//카테고리 공지/관리
			break;
		case 5:
			System.out.println("카테고리 (추가/수정/삭제)");
			//카테고리 추가
			//카테고리 수정
			//카테고리 삭제
			break;
		case 6:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 입니다.");
			
		}
		
	}

	private static void printMenu() {
		
		System.out.println("==================");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 게시글(둥록/수정/삭재)");
		System.out.println("4. 카테고리 관리(공지/자유)");
		System.out.println("5. 카테고리 (추가/수정/삭제)_관리자용");
		System.out.println("6. 프로그램 종료");
		System.out.println("==================");
		System.out.println("메뉴 선택: ");
		
	}

}
