package textendsclass;

/**
 - T �ڷ����� ������ ���� �� �� ����
- ���� Ŭ�������� �����ϰų� �����ϴ� �޼��带 Ȱ���� �� ����

=> T�� ������ Ŭ������ �� �� ���� Material Ŭ������ ��ӹ��� Ŭ������ ����
 */

public class GenericPrinter<T extends Material> {  // T : Type parameter, T�� ���� Powder�� Plastic�� ����Ŭ���� Material�� ����
	private T material;
	
	public void setMaterial(T material) { 
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();
	}
	
	

}
