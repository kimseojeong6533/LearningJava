package second;
/**
 ex)  if (ca instanceof Cake) 에서
   ca : 참조변수, Cake : 클래스의 이름
   => ca가 참조하는 인스턴스가 Cake클래스의 인스턴스이거나 Cake를 상속하는 클래스(Cake의 하위클래스)의 인스턴스일 경우 True반환 아니면 False
  Parent 상위클래스(p) <--- Son 하위클래스(s)
 
 */

class Cake3{	
}

class CheeseCake3 extends Cake3{
}

class StrawberryCheeseCake3 extends CheeseCake3{
}

public class YummyCakeOf {

	public static void main(String[] args) {
		Cake3 c = new StrawberryCheeseCake3();  // 참조변수 c가 참조하는 인스턴스는 StrawberryCheeseCake3클래스의 인스턴스
		Cake3 c2 = new Cake3();
		
		if(c2 instanceof Cake3) {   // StrawberryCheeseCake3의 상위 클래스의 상위클래스가 Cake3이므로 True
			System.out.println("케익인스턴스 or");
			System.out.println("케익 상속하는 인스턴스");
			System.out.println();
		}
		if(c2 instanceof CheeseCake3) {  // StrawberryCheeseCake3의 상위클래스가 CheeseCake3이므로 true
			System.out.println("치즈케익인스턴스 or");
			System.out.println("치즈케익 상속하는 인스턴스");
			System.out.println();
		}
		if(c2 instanceof StrawberryCheeseCake3) {  // c가 참조하는 클래스이므로 true
			System.out.println("딸기치즈케익인스턴스 or");
			System.out.println("딸기치즈케익 상속하는 인스턴스");
			System.out.println();
		}

	}

}
