package genericprogramming;

// ���� ����ȯ ��� ���׸� Ÿ���� �̿�

public class GenericPrinter<T> {  // T : Type parameter
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
