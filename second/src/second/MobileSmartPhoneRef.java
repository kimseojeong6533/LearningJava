package second;

/**
 �޼ҵ� �������̵� : ���� Ŭ������ ���ǵ� �޼ҵ带 ����Ŭ�������� �������ϴ� ��
 
 */

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	protected void answer() {
		System.out.println("Hi~ from "+number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in "+androidVer);
	}
	
}

public class MobileSmartPhoneRef {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-1234-5678","Nougat");
		MobilePhone ph2 = new SmartPhone("010-999-9999","Nougat");  // ����Ŭ����(MobilePhone)�� ��������(ph2)�� ����Ŭ������ �ν��Ͻ�(new SmartPhone)�� ������ �� ����.
		
		//ph1�� Smartphone��ü����, Mobilephone��ü�̱⵵�ϴ�.
		
		ph1.playApp();
		ph1.answer();
		
		ph2.answer();
	   //ph2.playApp();  // <- �Ұ��ϴ�
       // ����Ŭ������ ���������� �������� ���� �ش��ϴ� Ŭ����(MobilePhone)�� 
	   //�� Ŭ������ ����Ŭ������ ���ǵ� �޼ҵ�鸸 ȣ�Ⱑ��. �� Ŭ������ ����Ŭ������ ���ǵ� �޼ҵ���� ȣ��Ұ� 
		

	}

}
