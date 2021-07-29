package interfaceTest;

/**
 인터페이스에서
 -모든 변수는 public static final로 선언됨
 -모든 메서드는 public abstract로 선언됨
 */

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int x, int y);
	int substract(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
	

}
