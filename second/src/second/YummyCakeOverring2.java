package second;

/**
 �޼ҵ� �������̵�(Overriding) : ����Ŭ�������� ���ǵ� �޼ҵ带 ����Ŭ�������� �������ϴ� ��.
 ��, �޼ҵ��� �̸�, ��ȯ��, �Ű����� ������ ��� �����ؾ�, �޼ҵ� �������̵��� ������.
 
 �������̵��� �ϸ�, ���������� ���� ������� �������̵� �� �޼ҵ�(CheeseCake�� yummy)��
 �������̵��� �޼ҵ�(Cake2�� yummy)�� ����ϰ� ��
 ��, �������̵��� Ȱ���ϸ� ����Ŭ������ ���������̴��� 
 ����Ŭ���� �޼ҵ带 ȣ���ϴ� ��ó��(������ ����Ŭ���� �޼ҵ带 ȣ��������, ��ȿȭ(overriding)��) 
 ȣ���� �� ����.
 
 + ������ �������̵� x, Ŭ���� ����, Ŭ���� �޼ҵ嵵 �������̵� x 
 Only �ν��Ͻ� �޼ҵ常 �������̵��� �����ϴ�!!
 */
class Cake2{
	public int size;
	public static int cVariable=10;
	
	public Cake2() {
		size = 0;
	}
	
	public Cake2(int s) {
		size = s;
	}
	public void yummy() {
		System.out.println("Yummy Cake");
	}
	public static void testClassMethod() {
		System.out.println("Cake2 - testClassMethod");
	}
}

class CheeseCake2 extends Cake2{
	public int size;
	public static int cVariable=20;
	public CheeseCake2() {
		size = 0;
	}
	public CheeseCake2(int s1, int s2) {
		super(s1);
		size = s2;              // Cake2Ŭ���� ���� ������ �̸��� ������ �������̵� ��������. 
	}
	public void yummy() {
		super.yummy();  // ����Ŭ������ Cake2�� �޼ҵ� ȣ��
		System.out.println("Yummy Cheese Cake");  // Yummy()��� �޼ҵ带 ������
	}
	
	public static void testClassMethod() {
		System.out.println("CheeseCake2 - testClassMethod");
	}
	
	public void showCakeSize() {
		System.out.println("Cake2�� size : "+super.size);
		System.out.println("CheeseCake2�� size : "+size);
	}
}
public class YummyCakeOverring2 {

	public static void main(String[] args) {
		Cake2 c1 = new Cake2();
		Cake2 c2 = new CheeseCake2();   // ������������ ������� �������̵��� �޼ҵ�(CheeseCake�� yummy)�� ȣ���.
		//��, �������̵��� ���� ����Ŭ���������� ����� ���������� �����޼ҵ带 ȣ���� �� �ְ� ��.
		CheeseCake2 c3 = new CheeseCake2();
		
		c1.yummy();  // Yummy Cake
		c2.yummy();  // Yummy Cheese Cake
		c3.yummy();  // Yummy Cheese Cake
		System.out.println();
		
		// Ŭ���� ���� ������ �������̵� x
		CheeseCake2 c4 = new CheeseCake2(3,4);
		Cake2 c5 = c4;
		c4.showCakeSize();
		System.out.println("c4�� size : "+c4.size);
		System.out.println("c5�� size : "+c5.size);
		
		//Ŭ���� ����(static)�� �������̵� x
		System.out.println();
		System.out.println(Cake2.cVariable);
		System.out.println(CheeseCake2.cVariable);
		
		// Ŭ���� �޼ҵ嵵 �������̵� x 
		System.out.println();
		Cake2.testClassMethod();
		CheeseCake2.testClassMethod();
		
		
		
	}

}