package abstractClassExer;

public abstract class Computer {   // �߻�޼��带 ������ Ŭ���� : �߻�Ŭ����  *�߻� Ŭ������ new �� �� ���� ( �ν��Ͻ�ȭ �� �� ���� )
	public abstract void display();   // �߻�޼���  -> ��ӹ޴� Ŭ�������� �߻�Ŭ�������� ������
	public abstract void typing();    // �߻�޼���
	
	void turnOn() {
		System.out.println("������ ŵ�ϴ�");
	}
	void turnOff() {
		System.out.println("������ ���ϴ�");
	}
}
