package fileInputOutputStreamWithChar;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			
			fw.write('A'); 
			char[] buf = {'B','C','D','E','F'};
			
			fw.write(buf);
			fw.write("잘 지내나요");
			fw.write(buf,1,2);  // C, D만 써짐
			fw.write("65");  // 숫자 쓰기 
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("END");
		
	}

}
