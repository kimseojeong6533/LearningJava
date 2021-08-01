package genericprogramming;

public class ThreeDPrinter_Object {
	private Object material;   // Object로 선언해서 Platic or Power로 형변환 가능하게 함.
		
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}

}
