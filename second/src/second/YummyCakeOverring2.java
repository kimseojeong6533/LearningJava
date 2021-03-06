package second;

/**
 메소드 오버라이딩(Overriding) : 상위클래스에서 정의된 메소드를 하위클래스에서 재정의하는 것.
 단, 메소드의 이름, 반환형, 매개변수 선언이 모두 동일해야, 메소드 오버라이딩이 성립함.
 
 오버라이딩을 하면, 참조변수의 형에 상관없이 오버라이딩 한 메소드(CheeseCake의 yummy)가
 오버라이딩된 메소드(Cake2의 yummy)를 대신하게 됨
 즉, 오버라이딩을 활용하면 상위클래스형 참조변수이더라도 
 하위클래스 메소드를 호출하는 것처럼(원래는 상위클래스 메소드를 호출했으나, 무효화(overriding)됨) 
 호출할 수 있음.
 
 + 변수는 오버라이딩 x, 클래스 변수, 클래스 메소드도 오버라이딩 x 
 Only 인스턴스 메소드만 오버라이딩이 가능하다!!
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
		size = s2;              // Cake2클래스 내부 변수와 이름이 같지만 오버라이딩 되지않음. 
	}
	public void yummy() {
		super.yummy();  // 상위클래스인 Cake2의 메소드 호출
		System.out.println("Yummy Cheese Cake");  // Yummy()라는 메소드를 재정의
	}
	
	public static void testClassMethod() {
		System.out.println("CheeseCake2 - testClassMethod");
	}
	
	public void showCakeSize() {
		System.out.println("Cake2의 size : "+super.size);
		System.out.println("CheeseCake2의 size : "+size);
	}
}
public class YummyCakeOverring2 {

	public static void main(String[] args) {
		Cake2 c1 = new Cake2();
		Cake2 c2 = new CheeseCake2();   // 참조변수형에 상관없이 오버라이딩한 메소드(CheeseCake의 yummy)가 호출됨.
		//즉, 오버라이딩을 통해 상위클래스형으로 선언된 참조변수가 하위메소드를 호출할 수 있게 함.
		CheeseCake2 c3 = new CheeseCake2();
		
		c1.yummy();  // Yummy Cake
		c2.yummy();  // Yummy Cheese Cake
		c3.yummy();  // Yummy Cheese Cake
		System.out.println();
		
		// 클래스 내부 변수는 오버라이딩 x
		CheeseCake2 c4 = new CheeseCake2(3,4);
		Cake2 c5 = c4;
		c4.showCakeSize();
		System.out.println("c4의 size : "+c4.size);
		System.out.println("c5의 size : "+c5.size);
		
		//클래스 변수(static)는 오버라이딩 x
		System.out.println();
		System.out.println(Cake2.cVariable);
		System.out.println(CheeseCake2.cVariable);
		
		// 클래스 메소드도 오버라이딩 x 
		System.out.println();
		Cake2.testClassMethod();
		CheeseCake2.testClassMethod();
		
		
		
	}

}
