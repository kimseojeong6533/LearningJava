package abstractClassExer;

public class Desktop extends Computer{  //�߻�޼��带 ��� �����ߴ��� �߻�Ŭ������ ������ �� ���� but, �ν��Ͻ������� �ȵ�.
	                                                                                 // �߻�Ŭ������ �����Ѵ� = ��Ӹ��� ���ؼ� �ش� Ŭ������ ����ϱ� ����. 

	@Override
	public void display() {  // Computer��� �߻�Ŭ������ �߻�޼ҵ带 ����
		System.out.println("Desktop Displaying");
	}

	@Override
	public void typing() {   // Computer��� �߻�Ŭ������ �߻�޼ҵ带 ����
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
