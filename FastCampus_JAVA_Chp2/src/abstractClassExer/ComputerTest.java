package abstractClassExer;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer computer = new Computer(); // 추상클래스는 인스턴스생성이 안됨.(body가 구현되지않은 메서드가 있기 때문)
		Desktop computer = new Desktop();
		Computer computer2 = new Desktop(); // Desktop(하위클래스) 인스턴스 -> 업캐스팅 가능 
		MyNotebook mynotebook = new MyNotebook();  
		
		computer.display();
		computer2.turnOff();
		mynotebook.turnOn();
		
		
	}

}
