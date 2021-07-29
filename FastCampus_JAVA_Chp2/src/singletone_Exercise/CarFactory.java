package singletone_Exercise;

/**
 * 
 <예시 구현해보자>
 자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됩니다. 
 자동차 번호가 10001부터 시작되어 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 구현하세요
 다음 CarFactoryTest.java 테스트 코드가 수행 되도록 합니다.

 */
class Car{
	
	private static int carNum=10001;
	private int carId;
	public Car() {
		carId = carNum++;   /// 자동차가 생산될때마다 1씩 증가
	}
	public int getCarNum() {
		return carId;      
	}  
}

public class CarFactory {
	
	public CarFactory() {
	}
	private static CarFactory Instance = new CarFactory();
	
	public static CarFactory getInstance() {
		return Instance;
	}
	public Car createCar() {
		return new Car();
	}
	
	
	

	
}
