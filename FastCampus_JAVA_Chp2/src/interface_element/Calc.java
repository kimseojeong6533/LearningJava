package interface_element;

/**
 �������̽�����
 -��� ������ public static final�� �����
 -��� �޼���� public abstract�� �����
 */

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int x, int y);
	int substract(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
	
	default void description() {  // ����Ʈ �޼��� -> ������ Ŭ�����󿡼� �������ؼ� ��� �Ǵ� ����Ʈ������ ������ ���� �״�� ��밡��.
		System.out.println("������ ��Ģ������ �����մϴ�");
		myMethod();
	}  

	static int total(int[] arr) {    // �����޼��� (�ν��Ͻ� ������ �����ϰ� ����� �� ����)
		int total = 0;
		
		for(int num:arr)
			total+=num;
		myStaticMethod();
		return total;
	}
	
	//private �޼��� : �������̽� �������� ����ϵ��� �ϴ� �޼��� (������ Ŭ�������� �������ؼ� ���x) -> �������̽��� static�޼���, default �޼��忡�� ��밡���ϴ�. 
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {    
		System.out.println("myStaticMethod");
	}
}
