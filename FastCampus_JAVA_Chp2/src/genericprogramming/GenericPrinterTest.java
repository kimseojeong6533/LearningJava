package genericprogramming;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		GenericPrinter<Powder> powderprinter = new GenericPrinter<>();  // Generic Type T�� Ȱ��
		powderprinter.setMaterial(powder);  // powderŸ������ set
		
		Powder p = powderprinter.getMaterial();             // ���� ����ȯ�� ���� �ʾƵ� Powder������ ��ȯ��.
		System.out.println(powderprinter.toString());  
	}

}
