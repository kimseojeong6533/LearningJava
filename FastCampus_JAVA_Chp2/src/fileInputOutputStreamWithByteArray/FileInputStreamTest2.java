package fileInputOutputStreamWithByteArray;

import java.io.FileInputStream;
import java.io.IOException;


// 바이트 단위 입력 스트림 이것저것 

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			while((i = fis.read()) != -1) {    // EndOfFile : -1리턴  -> 파일 끝까지 읽고 출력
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
