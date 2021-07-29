package singletone_Exercise;

/**
 * 
 <���� �����غ���>
 �ڵ��� ������ �ֽ��ϴ�. �ڵ��� ������ ������ ��ü�̰�, �� ���忡�� ����Ǵ� �ڵ����� ���۵� ������ ������ ��ȣ�� �ο��˴ϴ�. 
 �ڵ��� ��ȣ�� 10001���� ���۵Ǿ� �ڵ����� ����� ������ 10002, 10003 �̷��� ��ȣ�� �ٵ��� �ڵ��� ���� Ŭ����, �ڵ��� Ŭ������ �����ϼ���
 ���� CarFactoryTest.java �׽�Ʈ �ڵ尡 ���� �ǵ��� �մϴ�.

 */
class Car{
	
	private static int carNum=10001;
	private int carId;
	public Car() {
		carId = carNum++;   /// �ڵ����� ����ɶ����� 1�� ����
	}
	public int getCarNum() {
		return carId;      
	}  
}

public class CarFactory {
	
	public CarFactory() {
	}
	private static CarFactory Instance = new CarFactory();
	
	public static CarFactory getInstance() {
		return Instance;
	}
	public Car createCar() {
		return new Car();
	}
	
	
	

	
}
