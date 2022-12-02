package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KioskMain {
	static Scanner scan = new Scanner(System.in);
	private static List<Product> productList = new ArrayList<Product>();
	public static void main(String[] args) {
		/*제품을 관리하는 프로그램을 작성하세요.
		 * - 구매가격, 판매가격은 변동이 없음
		 * 기능
		 * - 제품 등록(분류, 제품명, 수량, 구매가격, 판매가격)
		 * - 제품 수정
		 * - 제품 삭제
		 * - 제품 구매(관리자가 구매, 입고)
		 * - 제품 판매
		 * - 매출액 확인
		 * 		-년별	
		 * 			-제품별
		 * 			-전체	
		 * 		-월별
		 * 			-제품별
		 * 			-전체
		 * 		-일별
		 * 			-제품별
		 * 			-전체
		 * 		-제품별
		 * 			-제품별
		 * 			-전체 
		 * 분류 : 식품
		 * 제품명 : 진라면
		 * 수량: 0
		 * 구매가격 : 400원
		 * 판매가격 : 500원
		 * 진라면 100개 구매 => 진라면 수량 100개
		 * 진라면 10개 판매(날짜) = 진라면 수량 90개
		 */
		
		int menu= -1;
		do {			
			printMenu();			
			menu = scan.nextInt();
			runMenu(menu, productList);			
			
		}while(menu != 7);	
		
	}

	private static void runMenu(int menu, List<Product> productList) {
		
		switch(menu) {
		case 1:	regProduct();	

			break;
		case 2:	updateProduct(); System.out.println("수정");
			break;
		case 3: //deleteProduct(); System.out.println("삭제");
			break;
		case 4: //buyProduct(); System.out.println("구매");
			break;
		case 5: //sellProduct();System.out.println("판매");
			break;
		case 6: //total(); System.out.println("매출액 확인");
			break;
		case 7: System.out.println("키오스크 종료");
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
			
		}
		
	}

	private static boolean updateProduct(int menu, List<Product> productList) {
		if(productList.size() == 0)
			return false;
		int index = productList.indexOf(productList);
		if(index == -1)
			return false;
		productList.set(index, List<Product> productList);
		return true;
		
	}

	private static void regProduct() {
		scan.nextLine();
		System.out.println("제품 분류:");
		String type = scan.nextLine();
		System.out.println("제품 이름:");
		String productName = scan.nextLine();
		System.out.println("제품 수량:");
		int productCnt = scan.nextInt();
		System.out.println("제품 구매가격:");
		int buyPrice = scan.nextInt();
		System.out.println("제품 판매가격:");
		int sellPrice = scan.nextInt();
		Product product = new Product(type, productName, productCnt,buyPrice,sellPrice);
		productList.add(product);
		System.out.println(productList);
		
	}

	private static void printMenu() {
		System.out.println("======메뉴=====");
		System.out.println("1. 제품 등록");
		System.out.println("2. 제품 수정");
		System.out.println("3. 제품 삭제");
		System.out.println("4. 제품 구매");
		System.out.println("5. 제품 판매");
		System.out.println("6. 매출액 확인");
		System.out.println("7. 키오스크 종료");
		System.out.println("===============");
		System.out.println("메뉴 선택: ");		
	}
}
