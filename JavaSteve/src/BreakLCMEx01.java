
public class BreakLCMEx01 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int i;
		for(i=num1;i<=num1*num2;i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.print(i);
				break;
			}
		}
		
	}

}
