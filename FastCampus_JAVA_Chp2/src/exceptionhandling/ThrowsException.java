package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws : 해당 메서드를 호출하는 클래스에서 예외처리하도록 한다는 의미 (예외처리를 미룬다라고 표현) 
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
   // loadClass메서드를 호출한 클래스에서 ClassNotFoundException과 FileNotFoundException을 처리하도록 throws를 사용
		
		FileInputStream fis = new FileInputStream(fileName);  
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try { 
			test.loadClass("b.txt", "java.lang.String");  //java.lang.String    
		} catch (ClassNotFoundException | FileNotFoundException e  ) {  // 여러개의 Exception이 발생했을 때, 함께 처리할 수 있음 (따로 catch문을 여러개 만들어 각각의 예외처리를 설정할 수도 있음)
			System.out.println(e);
		
		} catch(Exception e) {   // ClassNotFoundException이나 FileNotFoundException을 제외한 나머지 Exception을 업캐스팅하여 처리할수도 있다
			System.out.println(e);
		}                                       // 특정 예외처리를 제외하고, 단순히 Exception 클래스를 활용하여 defualt 처리를 할 때 Exception 블록은 맨 마지막에 위치해야 함
		
		System.out.println("end");
		
	}
}
