package abstractClassExer;

/**
 템플릿 메서드 : 추상메서드나 구현된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
 final로 선언 -> 하위클래스에서 재정의 안됨.(final 변수 : 상수 / final 메서드 : 재정의 안되는 메서드 / final 클래스 : 상속x)
 *프레임워크(android)에서 많이 사용되는 설계 패턴
 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고 하위 클래스에서
 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 함
 */

public class CarTest {

	public static void main(String[] args) {
		Car aicar = new AICar();
		aicar.run();
		
		System.out.println("=====================");
		Car mcar = new ManualCar();
		mcar.run();
		

	}

}
