package fileInputOutputStreamWithByteArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {  // 
		
		// Byte Array ������ �ڵ鸵�Ͽ� ���Ͽ� write�ϱ�
		
		FileOutputStream fos = new FileOutputStream("output2.txt",true);  // ���Ͽ� Overwrite���� �ʰ� append�� �Ϸ���, trueó�� (default : false -> Overwrite) 
		
		try(fos){  
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i = 0; i < bs.length;i++) {
				bs[i] = data++;    // A(65) ~ Z(90)���� 
			}
			fos.write(bs, 2, 10);  // ����Ʈ �迭 bs�� 2��° �ε������� 10���� write�Ѵ�
			
		} catch (IOException e) {
			System.out.println(e);

		} 
		System.out.println("END");

	}

}
