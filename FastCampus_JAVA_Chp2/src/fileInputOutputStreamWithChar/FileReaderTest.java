package fileInputOutputStreamWithChar;

import java.io.FileReader;
import java.io.IOException;

/*
 문자단위 입출력 스트림(문자, 한글을 읽고 쓰는데 사용) ->  FileReader
 */

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		try(FileReader fis = new FileReader("reader.txt")) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
