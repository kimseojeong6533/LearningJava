package abstractClassExer;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("���������� �մϴ�");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ��տ��� ������ ����ϴ�");
		
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
	public void washCar() {    //��ӹ��� Ŭ������ ���� �޼��� ������ 
		System.out.println("�ڵ�����");
	}
	
	

}
