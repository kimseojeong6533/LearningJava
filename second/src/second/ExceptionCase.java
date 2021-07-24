package second;

import java.nio.file.*;
import java.io.BufferedWriter;
import java.io.IOException;

public class ExceptionCase {

	public static void md1() throws IOException{  // throws : 예외(IOException)의 처리를 md1을 호출한 메소드에게 넘긴다
		md2();
	}
	
	public static void md2() throws IOException{
		Path file = Paths.get("C:\\Users\\User\\eclipse-workspace\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('Z');
		
		if(writer != null)
			writer.close();
	}
	
	public static void main(String[] args) {
		try {
			md1();              //호출 순서 : main -> md1 -> md2
		}                           // md2에서 IOException발생하면, md1으로, md1은 main함수로 예외의 처리를 넘겨서 main에 있는 catch문에 의해 예외가 처리됨.
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
