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
 - 약 8K의 배열이 제공되어, 입출력을 빠르게 하는 기능이 제공되는 보조스트림.
 - BufferedReader, BufferedWriter는 문자용 입출력 보조스트림
 
 
 */

public class FileCopyTest {

	// BufferedInputStream과 BufferedOutputStream을 이용하여 파일 복사해보기
	
	public static void main(String[] args) throws IOException {
		
		long millisecond = 0;  // 파일읽는 시간 체크용
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Proj2_Fashion_MNIST_DeepLearning.zip"))){  // Proj2_Fashion_MNIST_DeepLearning.zip : 106KB 
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"));   // a.zip의 내용 -> copy.zip으로 복사하기
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}	
		System.out.println(millisecond + "소요되었습니다");
		
		//Socket socket = new Socket();
		//BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// br.readLine() 
		

	}

}
