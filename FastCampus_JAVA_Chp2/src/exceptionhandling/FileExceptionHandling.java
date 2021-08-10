package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args){
		
		/**
		 try-catch-finally (����ó���� ���� ����)
		 try���� ����ǵ�, ���ܰ� �߻��Ǿ� catch������ �Ѿ��, finally������ try-catch���� �������� �׻� �����.
		 ����, finally���� �̿��� ������ �ݰų�, ��Ʈ��ũ�� �ݴ� �� ���ҽ� ������ �����ϴµ� ���.
		 �������� ����ó�� ����� �ִ� ���, �������� ���ҽ��� ���������ʰ� finally�� �̿��Ͽ� �ڵ带 ����ϰ� © �� �ִ�.
		 
		 
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("b.txt");   // ���� project ������������ a.txt�� ã��
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			//return;          // return�� �ص� finally���� �׻� ȣ���. 
			
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
	 				e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
		
		/**
		 try-with-resources����(JAVA7���� ���ҽ��� ����ϴ� ���, close���� �ʾƵ� �ڵ����� �����ǵ��� ��)  
		 
		 * FileInputStream�� ��쿡 AutoCloseable�������̽��� �����ϰ� ���� 
		=> close()�� ��������� ȣ������ �ʾƵ� try{}��Ͽ��� ���� ���ҽ��� �������� ��쳪 ���ܰ� �߻��� ��� ��� �ڵ����� ���ҽ� ������ 
		     
		 */
		
//		try(FileInputStream fis = new FileInputStream("b.txt")){
//			System.out.println("Read");
//		} catch (FileNotFoundException e) {  // ������ ���� ��, �߻��ϴ� exception
//			e.printStackTrace();
//		} catch (IOException e) {   // close�Ҷ� �߻��ϴ� exception  -> �ڵ����� 
//			e.printStackTrace();
//		}
//		
//		System.out.println("end");
		
		
		
	}

}
