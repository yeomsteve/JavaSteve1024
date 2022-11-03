package day09;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		/*메뉴
		 * 1. 학생 추가
		 * 2. 학생성적 추가
		 * 3. 학생정보 출력
		 * 4. 프로그램 종료
		 * */
		//반복문을 통해 메뉴를 출력(프로그램종료 선택전까지)
		int menu;
		HighStudent [] list = new HighStudent [30];
		
		int count = 0;
		
		do {
			//메뉴를 출력
			printMenu();
			
			//메뉴 선택(입력)
			menu = selectMenu();
			
			//선택한 메뉴에 맞는 기능 실행
			count = runMenu(menu, list, count);
		}while(menu != 4);
		
	}
	/*
	 * 메뉴를 출력하는 메소드
	 */
	public static void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1. 학생추가");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 성적 추가");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 프로그램 종료 ");
		System.out.println("---------------");
		System.out.print("메뉴를 선택하세요 : ");
	}
	/*
	 * 콘솔에서 입력받은 정수(메뉴)를 알려주는 메소드
	 * @return 입력받은 정수(메뉴)
	 * */
	public static int selectMenu() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	/*
	 * 메뉴에 맞는 기능을 실행하는 메소드
	 * @param menu 선택한 메뉴
	 * @param list 학생들 정보가 들어있는 리스트
	 * @return 현재 저장된 학생수
	 * */
	public static int runMenu(int menu, HighStudent [] list, int count) {
		int grade, classNum, num;
		
		String name;
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1:
			//학생추가
			//학생 정보를 입력
			System.out.print("학생 정보 입력(학년, 반, 번호, 이름순) : ");
			grade = scan.nextInt();
			classNum = scan.nextInt();
			num = scan.nextInt();
			name = scan.next();
			
			//리스트에 학생 정보를 추가
			list[count] = new HighStudent(grade, classNum, num, name);
			
			//리스트에 들어가있는 학생수 1증가
			count++;
			break;
		case 2:
			//학생 성적 추가
			//학생을 선택 => 학생 정보를 출력후, 학생을 선택
			for(int i = 0;i<count;i++) {
				System.out.println("-----------");
				System.out.println(i+1+"번 학생");
				list[i].print();
				System.out.println("-----------");
			}		
			System.out.println("학생 선택: ");
			int index =scan.nextInt() - 1;
			//성적을 입력
			System.out.print("학생 성적 입력(국어, 영어, 수학) : ");
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			//해당 학생의 성적을 입력받은 성적으로 변경
			list[index].updateScore(kor, eng, math);
			break;
		case 3:
			//학생 정보 출력
			for(int i = 0;i<count;i++) {
				list[i].print();
			}
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
			break;
			default:
				System.out.println("잘못된 메뉴입니다.");
		}
		return count;
	}
	
}
