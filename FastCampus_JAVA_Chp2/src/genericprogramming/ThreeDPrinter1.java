package genericprogramming;

/**
 ���׸� ���α׷��� : 
 	Ŭ�������� ����ϴ� ������ �ڷ����� ������ �ϼ� �ְ�, �� ���(�޼���)�� ������ ��� Ŭ������ �ڷ����� Ư������ �ʰ� 
 	���� �ش� Ŭ������ ����� �� ���� �� �� �ֵ��� ����
     - ���� ���Ǵ� �ڷ����� ��ȯ�� �����Ϸ��� ���� �����ǹǷ� �������� ���α׷��� ���
     - �÷��� �����ӿ�ũ���� ���� ���ǰ� ����
 
 */

public class ThreeDPrinter1 {
	private Powder material;
	
	public void setMaterial(Powder material) {
		this.material = material;
	}
	public Powder getMaterial() {
		return material;
	}
	public String toString() {
		return "���� Powder�Դϴ�";
	}

	
}
