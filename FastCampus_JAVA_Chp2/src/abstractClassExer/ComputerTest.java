package abstractClassExer;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer computer = new Computer(); // �߻�Ŭ������ �ν��Ͻ������� �ȵ�.(body�� ������������ �޼��尡 �ֱ� ����)
		Desktop computer = new Desktop();
		Computer computer2 = new Desktop(); // Desktop(����Ŭ����) �ν��Ͻ� -> ��ĳ���� ���� 
		MyNotebook mynotebook = new MyNotebook();  
		
		computer.display();
		computer2.turnOff();
		mynotebook.turnOn();
		
		
	}

}
