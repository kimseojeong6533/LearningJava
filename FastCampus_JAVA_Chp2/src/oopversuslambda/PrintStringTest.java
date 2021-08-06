package oopversuslambda;



public class PrintStringTest {

	public static void main(String[] args) {
		PrintString reStr = returnString();  //���ٽ��� ��ȯ������ ���
		reStr.showString("HELLO");
		
		PrintString lambdaStr = s -> System.out.println(s+" "+"World~!");  // ���ٽ��� ������ ����
		lambdaStr.showString("GoodBye");
		
		showMyString(lambdaStr);   //�Ű������� ���ٽ��� ����
		
		
	}
	
	public static PrintString returnString() {          //���ٽ��� ��ȯ ������ ���
		return s->System.out.println(s+" "+"WORLD~!");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Hello3");
	}
		
}


