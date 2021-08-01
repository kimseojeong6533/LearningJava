package textendsclass;

/**
 - T 자료형의 범위를 제한 할 수 있음
- 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있음

=> T에 무작위 클래스가 들어갈 수 없게 Material 클래스를 상속받은 클래스로 한정
 */

public class GenericPrinter<T extends Material> {  // T : Type parameter, T에 대해 Powder와 Plastic의 상위클래스 Material로 정의
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
