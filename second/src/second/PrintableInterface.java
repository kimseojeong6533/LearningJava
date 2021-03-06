package second;


/**
 
 - 한 클래스는 여러가지 인터페이스를 동시에 구현할 수 있다. 
 - 상속과 구현은 동시에 가능하다 
 -  ex) class robot extends machine implements Movable, Runnable {...}
 - 인터페이스의 추상메소드(print)와 이를 구현하는 메소드사이에 오버라이딩 관계가 성립한다
 
 - 인터페이스에 존재할 수 있는 메소드 : 추상메소드, 디폴트메소드, static메소드
 - 인터페이스의 모든 메소드는 public이 선언된 것으로 간주
 - 인터페이스내에 선언되는 변수는 
     1. 선언과 동시에 값으로 초기화해야함
     2. 모든 변수는 public, static, final(상수)이 선언된 것으로 간주.
     
 */

interface Printable{    // 인터페이스 선언
	void print(String doc);   // 추상메소드, Abstract Method (메소드의 몸체가 비어있는 메소드)
}

interface ColorPrintable extends Printable{   // ColorPrintable인터페이스가 Printer를 상속한다(물려받는다) 
	void printCMYK(String doc);   // ColorPrintable -> printCMYK, print 
}

class Prn909Drv implements ColorPrintable  {  //Printer클래스가 Printable이라는 인터페이스를 구현(implements)한다.  
	@Override                   // 인터페이스의 추상메소드(print)와 이를 구현하는 메소드사이에 오버라이딩 관계가 성립한다. 즉, @Override의 선언이 가능 
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
		
		//		Printable prn = new Printer();    // 인터페이스의 형(Printable)을 대상으로 참조변수(prn) 선언
		//		prn.print("Hello Java");
		
		String myDoc = "This is report about ...";
		
		ColorPrintable prn = new Prn909Drv();  // 컬러인쇄 인터페이스형으로 인스턴스 생성
		prn.print(myDoc);
		prn.printCMYK(myDoc);   // 해당 클래스의 메소드 print, printCMYK 호출 가능함.
		System.out.println();
		
		Printable prn2 = new Prn909Drv();   // 흑백인쇄 인터페이스형으로 인스턴스 생성.
		prn2.print(myDoc);                            // print함수를 구현한 Printable 클래스가 명시되어 있지 않지만, Printable 클래스가 상속한 Prn909Drv를 통해 print함수를 호출할 수 있다. 
		
		

	}

}
