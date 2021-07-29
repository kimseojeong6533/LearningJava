package abstractClassExer;

public class Desktop extends Computer{  //추상메서드를 모두 구현했더라도 추상클래스로 선언할 수 있음 but, 인스턴스생성은 안됨.
	                                                                                 // 추상클래스로 선언한다 = 상속만을 위해서 해당 클래스를 사용하기 위함. 

	@Override
	public void display() {  // Computer라는 추상클래스의 추상메소드를 구현
		System.out.println("Desktop Displaying");
	}

	@Override
	public void typing() {   // Computer라는 추상클래스의 추상메소드를 구현
		System.out.println("Desktop Typing");
	}

	@Override
	void turnOn() {
		System.out.println("Desktop turnOn");
	}

	@Override
	void turnOff() {
		System.out.println("Desktop turnOff");
	}
	
	
	

}
