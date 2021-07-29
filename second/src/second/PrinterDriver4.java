package second;

// �������̽� ����Ʈ �޼ҵ带 ����غ��� (default void �޼ҵ��((�Ű�����)) {}   
/**
 ����Ʈ �޼ҵ��� Ư¡ : 
 - ��ü�� ������ �޼ҵ��̴� (�������̽������� �������� ���ǵ�)
 - �ش� �޼ҵ尡 ���Ե� �������̽��� �����ϴ� Ŭ������ �������̵� ���� �ʾƵ� ��.
 => ����, ����Ʈ �޼ҵ�� �������̽��� �߻� �޼ҵ带 �߰��ؾ��ϴ� ��Ȳ����  ������ ������ ���� �ڵ忡 ������ ��ġ�� �ʱ� ���� ������ ���� 
 */

interface Printable2{
	void print(String doc);
	default void printCMYK(String doc) {} // �������̽����� ����Ʈ �޼ҵ� ����
}

class Prn731Drv implements Printable2{

	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
		
	}
}

class Prn908Drv implements Printable2{
	
	public void print(String doc) {
		System.out.println("From Md-908 black & white ver");
		System.out.println(doc);
	}
	
	
	public void printCMYK(String doc) {
		System.out.println("From MD-908 CMYK ver");
		System.out.println(doc);
	}
}

public class PrinterDriver4 {

	public static void main(String[] args) {
		Printable2 prn1 = new Prn731Drv();
		Printable2 prn2 = new Prn908Drv();
		String myDoc = "This is Interface Exercise!!";
		
		prn1.print(myDoc);
		prn1.printCMYK(myDoc);
//		System.out.println();
//		prn2.print(myDoc);  // print�޼ҵ尡 ȣ��Ǿ����Ƿ� �ش� �޼ҵ� ������ ������, ����Ʈ �޼ҵ�� ������ printCMYK�Լ� ������ �ڵ����� ����.
//		System.out.println();
//		prn2.printCMYK(myDoc);
		
		
	

	}

}