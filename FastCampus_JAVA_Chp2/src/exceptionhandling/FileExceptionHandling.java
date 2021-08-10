package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args){
		
		/**
		 try-catch-finally (예외처리를 위한 구문)
		 try문이 실행되든, 예외가 발생되어 catch문으로 넘어가든, finally구문은 try-catch구문 마지막에 항상 실행됨.
		 따라서, finally문을 이용해 파일을 닫거나, 네트워크를 닫는 등 리소스 해제를 구현하는데 사용.
		 여러개의 예외처리 블록이 있는 경우, 각각에서 리소스를 해제하지않고 finally를 이용하여 코드를 깔끔하게 짤 수 있다.
		 
		 
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("b.txt");   // 상위 project 폴더에서부터 a.txt를 찾음
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			//return;          // return을 해도 finally문은 항상 호출됨. 
			
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
	 				e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
		
		/**
		 try-with-resources구문(JAVA7부터 리소스를 사용하는 경우, close하지 않아도 자동으로 해제되도록 함)  
		 
		 * FileInputStream의 경우에 AutoCloseable인터페이스를 구현하고 있음 
		=> close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 리소스 해제됨 
		     
		 */
		
//		try(FileInputStream fis = new FileInputStream("b.txt")){
//			System.out.println("Read");
//		} catch (FileNotFoundException e) {  // 파일이 없을 때, 발생하는 exception
//			e.printStackTrace();
//		} catch (IOException e) {   // close할때 발생하는 exception  -> 자동으로 
//			e.printStackTrace();
//		}
//		
//		System.out.println("end");
		
		
		
	}

}
