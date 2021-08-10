package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws : �ش� �޼��带 ȣ���ϴ� Ŭ�������� ����ó���ϵ��� �Ѵٴ� �ǹ� (����ó���� �̷�ٶ�� ǥ��) 
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
   // loadClass�޼��带 ȣ���� Ŭ�������� ClassNotFoundException�� FileNotFoundException�� ó���ϵ��� throws�� ���
		
		FileInputStream fis = new FileInputStream(fileName);  
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try { 
			test.loadClass("b.txt", "java.lang.String");  //java.lang.String    
		} catch (ClassNotFoundException | FileNotFoundException e  ) {  // �������� Exception�� �߻����� ��, �Բ� ó���� �� ���� (���� catch���� ������ ����� ������ ����ó���� ������ ���� ����)
			System.out.println(e);
		
		} catch(Exception e) {   // ClassNotFoundException�̳� FileNotFoundException�� ������ ������ Exception�� ��ĳ�����Ͽ� ó���Ҽ��� �ִ�
			System.out.println(e);
		}                                       // Ư�� ����ó���� �����ϰ�, �ܼ��� Exception Ŭ������ Ȱ���Ͽ� defualt ó���� �� �� Exception ����� �� �������� ��ġ�ؾ� ��
		
		System.out.println("end");
		
	}
}
