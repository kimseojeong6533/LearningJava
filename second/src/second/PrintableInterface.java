package second;


/**
 
 - �� Ŭ������ �������� �������̽��� ���ÿ� ������ �� �ִ�. 
 - ��Ӱ� ������ ���ÿ� �����ϴ� 
 -  ex) class robot extends machine implements Movable, Runnable {...}
 - �������̽��� �߻�޼ҵ�(print)�� �̸� �����ϴ� �޼ҵ���̿� �������̵� ���谡 �����Ѵ�
 
 - �������̽��� ������ �� �ִ� �޼ҵ� : �߻�޼ҵ�, ����Ʈ�޼ҵ�, static�޼ҵ�
 - �������̽��� ��� �޼ҵ�� public�� ����� ������ ����
 - �������̽����� ����Ǵ� ������ 
     1. ����� ���ÿ� ������ �ʱ�ȭ�ؾ���
     2. ��� ������ public, static, final(���)�� ����� ������ ����.
     
 */

interface Printable{    // �������̽� ����
	void print(String doc);   // �߻�޼ҵ�, Abstract Method (�޼ҵ��� ��ü�� ����ִ� �޼ҵ�)
}

interface ColorPrintable extends Printable{   // ColorPrintable�������̽��� Printer�� ����Ѵ�(�����޴´�) 
	void printCMYK(String doc);   // ColorPrintable -> printCMYK, print 
}

class Prn909Drv implements ColorPrintable  {  //PrinterŬ������ Printable�̶�� �������̽��� ����(implements)�Ѵ�.  
	@Override                   // �������̽��� �߻�޼ҵ�(print)�� �̸� �����ϴ� �޼ҵ���̿� �������̵� ���谡 �����Ѵ�. ��, @Override�� ������ ���� 
	public void print(String doc) {
		System.out.println("From MD-909 black & white");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

public class PrintableInterface {

	public static void main(String[] args) {
		
		//		Printable prn = new Printer();    // �������̽��� ��(Printable)�� ������� ��������(prn) ����
		//		prn.print("Hello Java");
		
		String myDoc = "This is report about ...";
		
		ColorPrintable prn = new Prn909Drv();  // �÷��μ� �������̽������� �ν��Ͻ� ����
		prn.print(myDoc);
		prn.printCMYK(myDoc);   // �ش� Ŭ������ �޼ҵ� print, printCMYK ȣ�� ������.
		System.out.println();
		
		Printable prn2 = new Prn909Drv();   // ����μ� �������̽������� �ν��Ͻ� ����.
		prn2.print(myDoc);                            // print�Լ��� ������ Printable Ŭ������ ���õǾ� ���� ������, Printable Ŭ������ ����� Prn909Drv�� ���� print�Լ��� ȣ���� �� �ִ�. 
		
		

	}

}