package abstractClassExer;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동켜기");
	}
	public void turnOff() {
		System.out.println("시동끄기");
	}
	
	public void washCar() {}    // 추상메서드가 아님, body({})가 있기 때문.
	
	final public void run() {   // 코드의 흐름(시나리오)를 정의하는 메서드
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar(); 
	}
	
	
	

}
