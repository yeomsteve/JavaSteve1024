package day11;

public class ClassDownCastingEx01 {

	public static void main(String[] args) {
		/*클래스 다운캐스팅은 조건부로 가능
		 * 안되는경우 : 부모클래스의 객체를 바로 자식클래스의 객체에 저장시.
		 *  */
		//KiaCar kcar = (KiaCar)(new Car(4,"K5", 0x00ff00, "123허1234", "기아"));
		//kcar.print();
		/*되는경우: 자식클래스객체를 부모클래스객체에 저장후,
		 * 부모클래스객체를 다시 자식클래스객체로 저장시.
		 * */
		KiaCar kcar1 = new KiaCar(4,"K5", 0x00ff00, "123허1234");
		Car car = kcar1;
		//Car car = new KiaCar(4,"K5",0x00ff00, "123허1234");
		KiaCar kcar2 = (KiaCar)car;
		kcar2.print();
		
		Car [] carList = new Car[5];
		carList[0] = new KiaCar(4, "K5", 0x00ff00, "123허1234");
		carList[1] = new HyundaiCar(4, "쏘나타", 0xff0000, "456가1234");
		for(Car tmp : carList) {
			if(tmp ==null) {
				continue;
			}
			//차 종류에 맞게 기아면 수동으로 기능을, 현대면 자동으로 트렁크가 
			//열리게하기위해 다운캐스팅을 함
			
				
			if(tmp instanceof KiaCar) {
				((KiaCar) tmp).hand();
			}else if(tmp instanceof HyundaiCar) {
				((HyundaiCar) tmp).auto();
			}
		}
		
		
		
	}

}
