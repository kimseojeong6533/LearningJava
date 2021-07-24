package second;

interface Printable3{
	void printLine(String str);
}

class SimplePrinter implements Printable3{  //SimplePrinter라는 클래스가 Printable3라는 인터페이스를 구현
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter{  //Printable3라는 인터페이스를 구현한 클래스를 상속한 Multiprintable -> Multiprintable은 Printable3 인터페이스를 간접적으로 구현했다고 처리됨.
	public void printLine(String str) {
		super.printLine("Start of Multi...");
		super.printLine(str);
		super.printLine("End of Multi../");
	}
}

public class InstanceOfInterface {

	public static void main(String[] args) {
		Printable3 prn1 = new SimplePrinter();
		Printable3 prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable3)   // 결과 : True
			prn1.printLine("This is SimplePrinter");
		System.out.println();
		
		if(prn2 instanceof Printable3) {  // 결과 : True
			prn2.printLine("This is MultiPrinter");
		}

	}

}
