package second;

// 인터페이스 디폴트 메소드를 사용해보자 (default void 메소드명((매개변수)) {}   
/**
 디폴트 메소드의 특징 : 
 - 자체로 완전한 메소드이다 (인터페이스내에서 공란으로 정의됨)
 - 해당 메소드가 포함된 인터페이스를 구현하는 클래스가 오버라이딩 하지 않아도 됌.
 => 따라서, 디폴트 메소드는 인터페이스에 추상 메소드를 추가해야하는 상황에서  이전에 개발해 놓은 코드에 영향을 미치지 않기 위해 등장한 문법 
 */

interface Printable2{
	void print(String doc);
	default void printCMYK(String doc) {} // 인터페이스에서 디폴트 메소드 선언
}

class Prn731Drv implements Printable2{

	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
		
	}
}

class Prn908Drv implements Printable2{
	
	public void print(String doc) {
		System.out.println("From Md-908 black & white ver");
		System.out.println(doc);
	}
	
	
	public void printCMYK(String doc) {
		System.out.println("From MD-908 CMYK ver");
		System.out.println(doc);
	}
}

public class PrinterDriver4 {

	public static void main(String[] args) {
		Printable2 prn1 = new Prn731Drv();
		Printable2 prn2 = new Prn908Drv();
		String myDoc = "This is Interface Exercise!!";
		
		prn1.print(myDoc);
		prn1.printCMYK(myDoc);
//		System.out.println();
//		prn2.print(myDoc);  // print메소드가 호출되었으므로 해당 메소드 내용이 나오고, 디폴트 메소드로 정의한 printCMYK함수 내용이 자동으로 나옴.
//		System.out.println();
//		prn2.printCMYK(myDoc);
		
		
	

	}

}
