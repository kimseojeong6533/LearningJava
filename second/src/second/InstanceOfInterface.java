package second;

interface Printable3{
	void printLine(String str);
}

class SimplePrinter implements Printable3{  //SimplePrinter��� Ŭ������ Printable3��� �������̽��� ����
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter{  //Printable3��� �������̽��� ������ Ŭ������ ����� Multiprintable -> Multiprintable�� Printable3 �������̽��� ���������� �����ߴٰ� ó����.
	public void printLine(String str) {
		super.printLine("Start of Multi...");
		super.printLine(str);
		super.printLine("End of Multi../");
	}
}

public class InstanceOfInterface {

	public static void main(String[] args) {
		Printable3 prn1 = new SimplePrinter();
		Printable3 prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable3)   // ��� : True
			prn1.printLine("This is SimplePrinter");
		System.out.println();
		
		if(prn2 instanceof Printable3) {  // ��� : True
			prn2.printLine("This is MultiPrinter");
		}

	}

}
