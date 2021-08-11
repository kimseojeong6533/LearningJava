package fileInputOutputStreamWithByteArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {  // 
		
		// Byte Array 단위로 핸들링하여 파일에 write하기
		
		FileOutputStream fos = new FileOutputStream("output2.txt",true);  // 파일에 Overwrite하지 않고 append를 하려면, true처리 (default : false -> Overwrite) 
		
		try(fos){  
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i = 0; i < bs.length;i++) {
				bs[i] = data++;    // A(65) ~ Z(90)까지 
			}
			fos.write(bs, 2, 10);  // 바이트 배열 bs의 2번째 인덱스부터 10개를 write한다
			
		} catch (IOException e) {
			System.out.println(e);

		} 
		System.out.println("END");

	}

}
