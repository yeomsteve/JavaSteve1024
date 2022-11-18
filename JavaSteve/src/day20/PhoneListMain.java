package day20;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneListMain {

	public static void main(String[] args) {
		/* 전화번호를 관리하는 프로그램을 작성하세요.
		 * 1. 전화번호 추가(성, 이름, 직장, 전화번호들)
		 * 2. 전화번호 수정
		 * 	  - 이름으로 검색(성+이름)
		 * 	  - 검색된 사람들중에서 선택
		 *	  - 성, 이름을 수정할건지,
		 *	    기존 등록된 전화번호를 수정할건지
		 *		새 전화번호를 등록할건지를 선택하여 동작
		 *3.  전화번호 삭제
		 *	  - 이름으로 검색(성+이름)
		 *    - 검색된 사람들 중에서 선택
		 *    - 선택된 사람의 연락처를 삭제
		 *4.  전화번호 조회
		 *	  - 이름으로 검색    
		 *	  - 검색된 사람들 중에서 선택
		 *	  - 선택된 사람의 연락처를 출력
		 * */
		
		//기본정보 - PhoneBook
		//주소록 - Contact
		Scanner scan = new Scanner(System.in);
		ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
		
		int menu = -1;
		do {
			printMenu();
			menu = scan.nextInt();
						
			
			switch(menu) {
			case 1:
				scan.nextLine();
				System.out.println("이름 추가: ");
				String name = scan.nextLine();				
				System.out.println("직장 추가: ");
				String work = scan.nextLine();
				System.out.println(name +" " + "님의 전화번호 추가: ");
				String number = scan.nextLine();
				PhoneBook phonebook = new PhoneBook(work, name, number);
				list.add(phonebook);
				System.out.println(phonebook);
				break;
			case 2:
				//2. 번호수정
				//이름 입력
				System.out.println("이름 입력: ");
				String name1 = scan.nextLine();
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
				System.out.println(name1);
				//수정할 전화번호부 선택
				//서브 메뉴 출력
				//서브 메뉴 선택
				//서브 메뉴 실행
				int subMenu = -1;
				do {
				//1. 이름, 직장 수정
					//이름 직장 입력
			
					//이름, 직장 수정
				
				//2. 기존 전화번호 수정
					//기존 전화번호를 출력
			
					//수정할 전화번호를 선택
			
					//이름, 번호를 입력
			
					//선택한 전화번호 이름, 번호를 수정
				}while(subMenu != 3);
				//3. 새 전화번호 추가
					//이름 번호를 입력
			
					//새 전화번호를 추가
				System.out.println("2번 번호 수정");
				break;
			case 3:
				//3. 번호 삭제
				//이름을 입력
				
				//이름이 포함된 전화번호부를 검색하여 출력(번호화 함께)
				
				//삭제할 전화번호부를 선택
				
				//전화번호를 삭제
				System.out.println("3번 번호 삭제");
				break;
			case 4:
				//4. 번호 조회 
				//이름을 입력
		
				//이름이 포함된 전화번호부를 검색하여 출력(번호화 함께)
				
				
				//조회할 전화번호부를 선택
				
				//전화번호를 조회
				System.out.println("4번 번호 조회");
				break;
			case 5:
				System.out.println("전화번호부 나가기");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
			
		}while(menu != 5);
		scan.close();
	}
	
	
public static void printMenu() {
	System.out.println("=======메뉴=======");
	System.out.println("1. 전화번호 추가");
	System.out.println("2. 전화번호 수정");
	System.out.println("3. 전화번호 삭제");
	System.out.println("4. 전화번호 조회");
	System.out.println("5. 전화번호부 나가기");
	System.out.println("==================");
	System.out.println("메뉴 선택: ");
}
}
