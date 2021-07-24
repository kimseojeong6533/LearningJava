package second;

import java.nio.file.*;
import java.io.BufferedWriter;
import java.io.IOException;

public class ExceptionCase {

	public static void md1() throws IOException{  // throws : ����(IOException)�� ó���� md1�� ȣ���� �޼ҵ忡�� �ѱ��
		md2();
	}
	
	public static void md2() throws IOException{
		Path file = Paths.get("C:\\Users\\User\\eclipse-workspace\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('Z');
		
		if(writer != null)
			writer.close();
	}
	
	public static void main(String[] args) {
		try {
			md1();              //ȣ�� ���� : main -> md1 -> md2
		}                           // md2���� IOException�߻��ϸ�, md1����, md1�� main�Լ��� ������ ó���� �Ѱܼ� main�� �ִ� catch���� ���� ���ܰ� ó����.
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
