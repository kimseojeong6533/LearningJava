package fileInputOutputStreamWithByteArray;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	
	public static void main(String[] args) {
		System.out.println("���ĺ��� ���� [Enter]�� ��������");
		
		int i;
		
		try {
			
			InputStreamReader irs = new InputStreamReader(System.in);  // ����Ʈ���� �Է� -> ���ڷ� �ٲ��� (�ѱ� ���ڵ� ����) 
			
			while((i = irs.read()) != '\n') {   //  read()�� ��ȯ���� ������ 0~255�� -1(������ ���϶�)
				
				System.out.print((char)i);       
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
