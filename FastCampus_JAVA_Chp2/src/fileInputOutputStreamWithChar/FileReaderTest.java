package fileInputOutputStreamWithChar;

import java.io.FileReader;
import java.io.IOException;

/*
 ���ڴ��� ����� ��Ʈ��(����, �ѱ��� �а� ���µ� ���) ->  FileReader
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
