package abstractClassExer;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("�����ڰ� ������ �մϴ�");
		System.out.println("�����ڰ� ������ �ٲߴϴ�");

		
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ������ ��ֹ��տ��� ������ ����ϴ�");
		
	}

	@Override
	public void wiper() {
		System.out.println("�����۸� ������ �����۰� �����Դϴ�"); 
		
	}
	

}
