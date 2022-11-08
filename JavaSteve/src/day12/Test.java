package day12;

public class Test {

	public static void main(String[] args) {
		

	}
//접근제한자 예약어 리턴타입 메소드명(매개변수);ㅣ
	//추상클래스를 상속받은 일반클래스는 부모의 추상메소드를 반드시 오버라이딩 해야 함.
	//추상클래스를 상속받은 추상클래스는 부모의 추상메소드를 반드시 오바라이딩 해야하는건 아님.
	int num;
	static int num2;

}
interface Calculator{
	int max = 30;
	int sum(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	double div(int num1, int num2);
	int mod(int num1, int num2);
	void run();
}