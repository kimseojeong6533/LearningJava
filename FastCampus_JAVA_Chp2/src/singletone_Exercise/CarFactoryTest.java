package singletone_Exercise;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car friendSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());     //10001 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
		System.out.println(friendSonata.getCarNum());   //10003 출력
	}
}

