package fileInputOutputStreamWithByteArray;

import java.io.FileInputStream;
import java.io.IOException;


// ����Ʈ ���� �Է� ��Ʈ�� �̰����� 

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			// ����Ʈ Array�� ���� �а� ����ϱ�
			
			byte[] bs = new byte[10];              // bs Byte Array�� ������� ���� Ʋ�� �Ǵ� ���� 
//			while((i = fis.read(bs)) != -1) { 
//				
////				for(int ch : bs) {
////					System.out.print((char)ch);  // -> ���̰� 10�̹Ƿ�, 10���� ��� (������ U~Z���� �ٲ� ��, �ٲ��� ���� QRST�� �״�� ��µǴ� ���� Ȯ���� �� �ִ�)
////				}
////				System.out.println(" : " + i + "����Ʈ ����");
//				
//				for(int j=0;j<i;j++) {   // ���� ���� ��ŭ ����ϱ�  -> ��ó�� ���� QRST�� ��µ��� �ʰ� ����ϰ� ��µ�.
//					System.out.print((char)bs[j]);
//				}
//				System.out.println(" : " + i + "����Ʈ ����");
//			}
			
			while ( (i = fis.read(bs, 2, 8)) != -1){   // read(byteArray, offset, len) 
				System.out.println("i : "+i);
				for(int k= 0; k<i; k++){
				
				System.out.print(k + ": " + (char)bs[k]+", ");
			}
			System.out.println(": " +i + "����Ʈ ����" );
		}

					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
