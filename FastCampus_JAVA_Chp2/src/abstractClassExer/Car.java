package abstractClassExer;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��ѱ�");
	}
	public void turnOff() {
		System.out.println("�õ�����");
	}
	
	public void washCar() {}    // �߻�޼��尡 �ƴ�, body({})�� �ֱ� ����.
	
	final public void run() {   // �ڵ��� �帧(�ó�����)�� �����ϴ� �޼���
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar(); 
	}
	
	
	

}
