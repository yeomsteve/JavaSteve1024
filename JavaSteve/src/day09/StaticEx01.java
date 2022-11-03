package day09;

public class StaticEx01 {

	public static void main(String[] args) {
		KiaCar k1 = new KiaCar("모닝");
		KiaCar k2 = new KiaCar("레이");
		KiaCar k3 = new KiaCar("K3");
		k1.print();
		k2.print();
		k3.print();
		k1.name = "K5";
		//k1.logo = "Kia"; 가능은 하지만 일반적이진않음.
		KiaCar.logo = "Kia";
		System.out.println("------");
		k1.print();
		k2.print();
		k3.print();
	}

}

class KiaCar{
	public static String logo = "KIA";
	public String name;
	public KiaCar(String name) {
		this.name = name;
	}
	public void print() {
		System.out.print(logo);
		System.out.println(" : " + name);
	}
	public static void printLogo() {
		System.out.print(logo);
		//System.out.println(" : " + name); // 에러발생
	}
}

/* Static => 클래스 필드/메소드
 * -같은 클래스로 만들어진 모든 객체들이 공유하는 필드/메소드에 붙이는 예약어/키워드
 * -클래스명을 통해 호출
 * -클래스가 메모리에 로딩이 되면 필드와 메소드가 생성
 * 
 *static이 안붙은은 필드/메소드 => 인스턴스 필드/메소드 or 객체 필드/메소드
 * -각 개체마다 필드/메소드를 가짐
 * -객체명으로 호출
 * -객체를 생성하는 시점에 필드와 메소드가 생성 
 *
 *Static 필드/메소드 => static메소드/객체메소드에서 사용 가능
 *객체 필드/메소드 => 객체 메소드에서 사용 가능
 *
 *final 필드 : 상수 => 값을 변경할수 없다
 *
 * */
