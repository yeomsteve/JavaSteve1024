package day10;
import day10_1.TestB;
public class AccessModifierEx01 {

	public static void main(String[] args) {
		TestA  a = new TestA();
		TestB  b = new TestB();
		//a.num1 = 1; //에러발생. private이기 떄문에 외부접근 X
		a.num2 = 2;//default이고 같은 패키지이기 때문에 정상 동작
		a.num3 = 3;
		//b.num1 = 1; //에러발생 private이기 때문에 외부접근 X
		//b.num2 = 2;//에러발생. default이기 때문에 다른 패키지에서 접근 못함
		b.num3 = 3;
		
	}

}
