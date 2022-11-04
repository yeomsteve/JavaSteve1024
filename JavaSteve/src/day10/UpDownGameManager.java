package day10;

import java.util.Scanner;



public class UpDownGameManager {

	public static void main(String[] args) {
		/*UpDown 게임을 구현하세요.
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * */

		//메뉴 출력
		//메뉴 선택
		//메뉴에 따른 기능 실행
			//1.플레이
				//컴퓨터가 랜덤수 생성
				//반복
					//사용자 숫자입력
					// Up Down 판별
				// 기존 기록보다 좋으면 기록을 추가	
				
			//2.기록확인
				//기록된 순위를 출력
			//3.종료
				
		int menu; 
		Record [] records = new Record [5];
		do {
			//메뉴 출력
			printMenu(
				"-----------",
				"메뉴",
				"1. 플레이",
				"2. 기록확인",
				"3. 종료",
				"-----------",
				"메뉴 선택 : "
			);
			//메뉴 선택
			menu = selectMenu();
			//선택한 메뉴에 따른 기능 실행: 선택한 메뉴,기록정보
			runMenu(menu, records);
		}while(menu != 3);
	}
	
	
	
	
	
	private static void printMenu(String ...strs) {
		for(int i = 0; i<strs.length; i++) {
			/*
			System.out.print(strs[i]);
			if(i != strs.length-1) {
				System.out.println();
			}*/
			System.out.print(strs[i] + (i!= strs.length-1?"\n":""));
		}
		
	}



	public static int selectMenu() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
	}
	
	
	
	/**
	 * 주어진 메뉴에 맞는 기능을 실행하는 메소드
	 * @param menu 실행할 메뉴 번호
	 * @param records 기록정보
	 */
	public static void runMenu(int menu, Record[] records) {
		
		switch(menu) {
		
		case 1:
			
			int coin = 3;
			int record[] = new int[coin];
			int min = 1, max = 100;
			Scanner scan = new Scanner(System.in);
			while(coin-->0) {
				int r = (int)(Math.random()*(max - min + 1)+min);
				System.out.println(min + " ~ " + max + "사이의 랜덤한 수를 맞추세요.");
				int num;
				int tryCount = 0;
				do {
					tryCount++;
					System.out.print("숫자 입력 : ");
					num = scan.nextInt();
				
					if (num == r) {
					
						System.out.println("정답입니다.");	
						record[record.length - coin - 1] = tryCount;
					}else if(num > r) {
						System.out.print("DOWN");
					
					}else {
					System.out.print("UP");
					}
				}
				while(r != num);
				
					for(int i = 0; i<record.length; i++) {
				System.out.println(i+1+"번째 게임 횟수 : " + record[i]);
			}
			scan.close();
			}	
		case 2:
			//2. 기록확인
			//등록된 5위까지의 기록을 확인
			printRecords(records);
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
		default:
			System.out.println("잘못된 메뉴입니다!!!");
	}
			//종료
	}



	




	private static void writeRecord(Record[] records, int tryCount) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력(예 : JIK) :");
		String name = scan.next();
		Record r = new Record(tryCount, name);
		int index = 0;
		for(int i=0;i<records.length;i++) {
			//1등부터 비교하여 나보다 기록이 좋으면 내 순위가 밀림
		
			if(records[i] != null && tryCount > records[i].getCount()) {
				index++;
			}
			//기록이 없는 처음 순위를 내 기록으로 하기위해 i를 index에 저장
			else if(records[i] == null) {
				index = i;
				break;
			}
			//비교 순위보다 내가 기록이 좋으면 반복문 종료
			else {
				index = i;
				break;
			}
		}
		if(index == 5) {
			return;
		
		System.arraycopy(records, index, records, index+1,
				records.length - index - 1);
		System.out.println("이름 입력(예: ABC) : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		records[index] = new Record(tryCount, name);
	}
}
		
	
	
	


	private static void printRecords(Record[] records) {
		for(int i =0 ; i<records.length; i++) {
			System.out.print(i+1+"위 ");
			if(records[i] != null) {
				records[i].print();
			}else {
				System.out.println();
			}
		}
	}
}

	
		
	


