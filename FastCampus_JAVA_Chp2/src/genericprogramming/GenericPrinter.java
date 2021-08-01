package genericprogramming;

// 직접 형변환 대신 제네립 타입을 이용

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
