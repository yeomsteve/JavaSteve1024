package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int i = 0;
		for(i=0;i<=20;i++) {
		switch(i) {
		case 0: if(i<=20 && i%5==0) {
			System.out.println(i + " 는 5의 배수입니다.");}
			break;
		default:
			break;
		}
		}System.out.println(i+ " 는 5의 배수가아닙니다");
	}
}
