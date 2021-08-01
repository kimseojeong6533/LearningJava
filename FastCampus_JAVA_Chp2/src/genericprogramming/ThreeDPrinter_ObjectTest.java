package genericprogramming;

public class ThreeDPrinter_ObjectTest {

	public static void main(String[] args) {
		
		//Object형으로 선언했을 때의 문제
		Powder Powder = new Powder();
		ThreeDPrinter_Object printer = new ThreeDPrinter_Object();
		
		printer.setMaterial(Powder);
	
		Powder p = (Powder) printer.getMaterial();  // => set할때에는 바로 코드를 사용가능하지만, get을 할때에는 따로 형변환을 해주어야하는 번거로움이 생김 -> 비효율
	}

}
