package genericprogramming;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		GenericPrinter<Powder> powderprinter = new GenericPrinter<>();  // Generic Type T를 활용
		powderprinter.setMaterial(powder);  // powder타입으로 set
		
		Powder p = powderprinter.getMaterial();             // 직접 형변환을 하지 않아도 Powder형으로 반환됨.
		System.out.println(powderprinter.toString());  
	}

}
