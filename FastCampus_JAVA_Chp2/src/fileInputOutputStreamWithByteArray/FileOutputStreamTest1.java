package fileInputOutputStreamWithByteArray;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){  //  �ش� ������ ������ �ڵ����� ������ ��������. 
																															 
			
			fos.write(65);  // A (���ڸ� write�ϸ� A�� ���Ͽ� ������)
			fos.write(66);  // B
			fos.write(67);  // C
			
		} catch (IOException e) {
			System.out.println(e);

		} 
		System.out.println("END");

	}

}
