package day12;

public class interfaceEx01 {

	public static void main(String[] args) {
		//interface를 통해 객체를 생성 불가능
		//TvRemoteController tr = new TvRemoteController();
		//하지만 interface 참조변수에 객체를 저장할수있음.
		//구현 클래스의 객체를 인터페이스에 참조변수에 저장할수있다.
		TvRemoteController remocon1 = new TvRemoteconA();
		//remocon1.print();
		((TvRemoteconA)remocon1).print();
		TvRemoteconA r2 = new TvRemoteconA();
		r2.turn();
		for(int i = 0; i<10; i++) {
			r2.channelUp();
		}
		for(int i = 0; i<2; i++) {
			r2.channelDown();
			}
			r2.channel(15);
			for(int i = 0; i<2; i++) {
				r2.volumeUp();
			}
			for(int i =0; i<5; i++) {
				r2.volumeDown();
			}
			r2.print();
		
	}

}

