package textendsclass;

public class GenericPrinterTest {

	public static void main(String[] args) {
//		Powder powder = new Powder();
//		GenericPrinter<Powder> powderprinter = new GenericPrinter<>();  // Generic Type T�� Ȱ��
//		powderprinter.setMaterial(powder);  // powderŸ������ set
//		
//		Powder p = powderprinter.getMaterial();             // ���� ����ȯ�� ���� �ʾƵ� Powder������ ��ȯ��.
//		System.out.println(powderprinter.toString());  
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(plasticPrinter);

	
	}

}
