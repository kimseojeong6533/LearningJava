package interfaceTest;

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
	

}
