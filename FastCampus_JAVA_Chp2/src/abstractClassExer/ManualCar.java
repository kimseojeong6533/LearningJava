package abstractClassExer;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("운전자가 주행을 합니다");
		System.out.println("운전자가 방향을 바꿉니다");

		
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟으면 장애물앞에서 스스로 멈춥니다");
		
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼를 누르면 와이퍼가 움직입니다"); 
		
	}
	

}
