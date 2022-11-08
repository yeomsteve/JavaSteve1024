package day12;

import java.util.Scanner;

import day09.HighStudent;

public class StudentManagerTest {

	public static void main(String[] args) {
		/*학생 성적관리 프로그램을 작성하세요
		 * - 작성하기 위해 필요한 작업들을 주석으로 정리해보세요.
		 * 
		 * 1.프로그램에 필요한기능정리------------------------
		 * 메뉴
		 * 	-1. 학생 정보 추가
		 * 	-2. 학생 성적 추가
		 * 	-3. 학생 정보 출력
		 * 	-4. 프로그램 종료
		 * 
		 * ----------------------------------------------------
		 * 2. 프로그램 실행 과정은 어떻게 할건지?
		 * 	-1. 학생정보 추가
		 *     -학년, 반, 번호, 이름을 입력하여 학생 정보 추가.
		 *     -학년, 반, 번호가 같은 학생이 이미 있으면 추가안함.
		 *  -2. 학생 성적 추가
		 *     -학년, 반, 번호로 학생을 검색후 있으면 성적을 추가.
		 *     -성적 추가시 과목명, 학기, 중간, 기말, 수행평가를 입력하여 추가.
		 *     -이미 추가된 과목(학기랑 과목명이 같으면)이면 추가안함.   
		 *  -------------------------------------------------------------   
		 * 3.정보를 효율적으로 관리하기위해 클래스를 만들것인가? 만든다면 어떤 클래스를 만들건지?
		 * 	   - 학생클래스 HighStudent
		 * 	   - 성적클래스 Score
		 * 	   	
		 * ---------------------------------------------------------------
		 * 4. 프로그램 실행 과정을 주석으로 작성.
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
	//반복	
	for( ; ; ) {	
		//메뉴 출력
		System.out.println("------메뉴------");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 성적 추가");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("메뉴 선택: ");
		//메뉴 선택
		int menu = scan.nextInt();
		//선택한 메뉴에 따른 기능 실행
		if(menu == 1) {
		//1.학생 정보 추가
			//학생 정보를 입력(학년, 반, 번호, 이름)
			
			//입력한 학생 정보가 없으면 추가
			
			System.out.println("학생 정보를 입력하세요(학년, 반번호, 학생번호, 이름순): ");
			
			
			int grade = scan.nextInt();
			int classNum = scan.nextInt();
			int num = scan.nextInt();
			String name = scan.next();
			list[count] = new HighStudent(grade, classNum, num, name);
			
		}else if(menu == 2){
			//2.학생 성적 추가
			//학생 정보를 입력(학년, 반, 번호)
			//입력한 학생 정보가 없으면 끝
			//성적 정보를 입력(과목, 학기, 중간, 기말, 수행평가)
			//입력한 성적 정보가 없으면 추가
			System.out.println("2. 학생 성적 추가 기능 구현 예정");
		}else if(menu == 3) {
			//3.학생 정보 출력
			//저장된 학생 정보를 출력
		
			System.out.println("3. 학생 정보 출력 기능 구현 예정");
		}else if(menu == 4) {
			
			//4.프로그램 종료
			System.out.println("4. 프로그램 종료");
			break;
		}else {
			System.out.println("잘못된 메뉴!");
		}
		
		
	
	
	
		
	}
	}

}
