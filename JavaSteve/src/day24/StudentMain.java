package day24;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	/* 학생 정보를 관리하는 프로그램 작성
	 * 1. 학생 추가(이름, 학년, 반, 번호) 
	 * 2. 학생 출력
	 * 3. 종료
	 * - 프로그램 시작 전 학생 정보를 읽어오는 기능 추가(load)
	 * - 프로그램 종료 전 학생 정보를 저장하는 기능 추가(save)
	 * */ 
	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		String fileName = "student.txt";
		int menu = -1;
		ArrayList<Student> list = new ArrayList<Student>();		
		load(list,fileName);
		do {
			printMenu();			
			menu = scan.nextInt();
			printBar();
			runMenu(menu,list);
				
	
		}while(menu != 3);
		save(list, fileName);
	}
	private static void runMenu(int menu,ArrayList<Student> list) {
		switch(menu) {
		case 1:
			addStudent(list);				
			
			break;
		case 2:
			printStudent(list);
			
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	private static void addStudent(ArrayList<Student> list) {
		
		if(list == null)
			throw new RuntimeException("예외발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
		scan.nextLine();
		System.out.println("이름 입력: ");
		String name = scan.nextLine();
		System.out.println("학년 입력: ");
		int grade = scan.nextInt();
		System.out.println("반 입력: ");
		int classNum = scan.nextInt();
		System.out.println("번호 입력: ");
		int num = scan.nextInt();
		Student std = new Student(num, grade, classNum, name);
		list.add(std);
		printStr("학생 추가가 완료됐습니다.");
		System.out.println(list);
		
	}
	private static void printStudent(ArrayList<Student> list) {
		if(list == null)
			throw new RuntimeException("예외 발생: 학생을 관리할 리스트가 생성되지 않앗습니다.");
		if(list.size()==0) {
			printStr("학생 정보가 없습니다.");
			return;
		}
		for(Student std : list) {
			System.out.println(std);
		}
		printBar();
	}
	private static void save(ArrayList<Student> list, String fileName) {
		if(list == null)
			throw new RuntimeException("예외 발생: 학생을 관리할 리스트가 생성되지 않앗습니다.");
				
		try (ObjectOutputStream oos	
				= new ObjectOutputStream(new FileOutputStream(fileName))) {
			for(Student std : list) {
				oos.writeObject(std);
		} 
		}catch (FileNotFoundException e) {
			printStr(fileName + "을 생서할 수 없어서 저장에 실패했습니다.");
		} catch (IOException e) {
			printStr("저장에 실패했습니다.");
		
		}
	}
	private static void load(ArrayList<Student> list, String fileName) {
		if(list == null)
			throw new RuntimeException("예외 발생: 학생을 관리할 리스트가 생성되지 않앗습니다.");
				
		try (ObjectInputStream ois	
				= new ObjectInputStream(new FileInputStream(fileName))) {
			while(true) {
				Student std = (Student)ois.readObject();
				list.add(std);
			}			
		}catch (FileNotFoundException e) {
			printStr(fileName + "이 없어서 저장에 실패했습니다.");
		}catch(EOFException e) {
			printStr("불러오기 완료.");
		}catch (Exception e) {
			printStr("불러오기 실패.");		
		} 	}
	public static void printMenu() {
					
		System.out.println("======메뉴======");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 출력");
		System.out.println("3. 종료");
		printBar();
		System.out.println("메뉴 선택 : ");
		
	}
	
	private static void printStr(String str) {
		System.out.println(str);
		printBar();
	}
	
	private static void printBar() {
		System.out.println("==============");
	}
	
}
