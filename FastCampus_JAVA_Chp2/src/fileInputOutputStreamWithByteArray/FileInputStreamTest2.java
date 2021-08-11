package fileInputOutputStreamWithByteArray;

import java.io.FileInputStream;
import java.io.IOException;


// ����Ʈ ���� �Է� ��Ʈ�� �̰����� 

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			while((i = fis.read()) != -1) {    // EndOfFile : -1����  -> ���� ������ �а� ���
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
