package interface_element;

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
	
	default void description() {  // 디폴트 메서드 -> 구현한 클래스상에서 재정의해서 사용 또는 디폴트상으로 구성한 내용 그대로 사용가능.
		System.out.println("정수의 사칙연산을 제공합니다");
		myMethod();
	}  

	static int total(int[] arr) {    // 정적메서드 (인스턴스 생성과 무관하게 사용할 수 있음)
		int total = 0;
		
		for(int num:arr)
			total+=num;
		myStaticMethod();
		return total;
	}
	
	//private 메서드 : 인터페이스 내에서만 사용하도록 하는 메서드 (구현한 클래스에서 재정의해서 사용x) -> 인터페이스내 static메서드, default 메서드에서 사용가능하다. 
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {    
		System.out.println("myStaticMethod");
	}
}
