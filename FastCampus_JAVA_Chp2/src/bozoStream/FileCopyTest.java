package bozoStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 <BufferedInputStream,  BufferedOutputStream> 
 - �� 8K�� �迭�� �����Ǿ�, ������� ������ �ϴ� ����� �����Ǵ� ������Ʈ��.
 - BufferedReader, BufferedWriter�� ���ڿ� ����� ������Ʈ��
 
 
 */

public class FileCopyTest {

	// BufferedInputStream�� BufferedOutputStream�� �̿��Ͽ� ���� �����غ���
	
	public static void main(String[] args) throws IOException {
		
		long millisecond = 0;  // �����д� �ð� üũ��
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Proj2_Fashion_MNIST_DeepLearning.zip"))){  // Proj2_Fashion_MNIST_DeepLearning.zip : 106KB 
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"));   // a.zip�� ���� -> copy.zip���� �����ϱ�
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}	
		System.out.println(millisecond + "�ҿ�Ǿ����ϴ�");
		
		//Socket socket = new Socket();
		//BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// br.readLine() 
		

	}

}
