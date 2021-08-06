package oopversuslambda;



public class PrintStringTest {

	public static void main(String[] args) {
		PrintString reStr = returnString();  //람다식을 반환값으로 사용
		reStr.showString("HELLO");
		
		PrintString lambdaStr = s -> System.out.println(s+" "+"World~!");  // 람다식을 변수에 대입
		lambdaStr.showString("GoodBye");
		
		showMyString(lambdaStr);   //매개변수로 람다식을 전달
		
		
	}
	
	public static PrintString returnString() {          //람다식을 반환 값으로 사용
		return s->System.out.println(s+" "+"WORLD~!");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Hello3");
	}
		
}


