package interfaceTest;

/**
 Calc(Interface) <---- Calculator(Abstract Class)  <------ CompleteCalc(Class) 
=> CompleteCalc는 Calc 인터페이스를 구현한 클래스를 상속 -> Calc형으로 선언 가능 
*클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있음 


*인터페이스를 왜 사용하는가?
-클래스나 프로그램이 제공하는 기능을 명시적으로 선언하는 것 = 인터페이스의 역할 및 기능
-일종의 클라이언트 코드와의 약속, 클래스나 프로그램이 제공하는 명세(specification)
-클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있음. 내부 로직까지 클라이언트단에서 알 필요가 없어지는 효율.    (클라이언트  --->  인터페이스 <---- 서버) 
-어떤 객체가 하나의 인터페이스타입이다 = 해당 인터페이스가 제공하는 모든 메소드를 구현한 객체라는 의미
-인터페이스를 구현한 다양한 객체를 사용함 = 다형성
ex) JDBC 인터페이스
 */

public class CalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		CompleteCalc completecalc = new CompleteCalc();  
		
		
		Calc calc = new CompleteCalc();   // CompleteCalc는 calc 인터페이스를 구현한 클래스  -> 인스턴스형으로 선언된 클래스 인스턴스 생성이 가능 but, Calc인터페이스에 존재하는 메서드만 사용가능.
		                                                          // 인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.mul(num1, num2));
		System.out.println(calc.div(num1, num2));
		//calc.printNum(); <- 오류,  Calc인터페이스에 선언되지 않은 메소드이므로 사용불가.
		
		
		
		
		

	}

}
