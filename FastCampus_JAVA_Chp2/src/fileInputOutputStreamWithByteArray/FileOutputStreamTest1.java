package fileInputOutputStreamWithByteArray;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){  //  해당 파일이 없으면 자동으로 파일을 생성해줌. 
																															 
			
			fos.write(65);  // A (숫자를 write하면 A가 파일에 쓰여짐)
			fos.write(66);  // B
			fos.write(67);  // C
			
		} catch (IOException e) {
			System.out.println(e);

		} 
		System.out.println("END");

	}

}
