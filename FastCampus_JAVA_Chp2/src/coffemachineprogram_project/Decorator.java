package coffemachineprogram_project;

public abstract class Decorator extends Coffee{  // ��ӿ� ����Ŭ�����θ� ����ϱ� ������, �Լ��� �̹� �����ߴ���, �߻�Ŭ������ ��������

	Coffee coffee;
	public Decorator(Coffee coffee) {  // ������ �Ű������� ������Ʈ�� �����ؾ� ��(Decorator ������ Ư¡) 
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
		
	}
	

}
