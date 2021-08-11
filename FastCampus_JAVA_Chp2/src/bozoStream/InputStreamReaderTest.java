package bozoStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 
 <������Ʈ��> : ���� �а� ���� ��Ʈ��(FileInputStream, FileReader, FileOutputStream, FileWriter ��)�� �ƴ� ��������� �����ϴ� ��Ʈ���̴�.
 - FilterInputStream�� FilterOutputStream�� ���� ��Ʈ���� ���� Ŭ��������
 - �������� �Ű������� �� �ٸ� ��Ʈ��(��� ��Ʈ���̳� �ٸ� ���� ��Ʈ��)�� ����  -> Ex. (new InputStreamReader(new FileInputStream))
 - Decorator Pattern���� ������.
 - ��ǥ������, ���ڷ� ��ȯ�ϴ� ������Ʈ��(InputStreamReader, OutputStreamReader), ���۸� ����� �߰��ϴ� ������Ʈ��(BufferedInputStream, BufferedOutputStream)�� �ִ�. 
 
 **/


public class InputStreamReaderTest {

	public static void main(String[] args) {
		//reader : �ȳ��ϼ��� �� �����ִ� ����
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){   // FileInputStream�� InputStreamReader��� ������Ʈ������ ����
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
