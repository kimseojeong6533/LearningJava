package textendsclass;

public class GenericPrinterTest {

	public static void main(String[] args) {
//		Powder powder = new Powder();
//		GenericPrinter<Powder> powderprinter = new GenericPrinter<>();  // Generic Type T를 활용
//		powderprinter.setMaterial(powder);  // powder타입으로 set
//		
//		Powder p = powderprinter.getMaterial();             // 직접 형변환을 하지 않아도 Powder형으로 반환됨.
//		System.out.println(powderprinter.toString());  
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(plasticPrinter);

	
	}

}
