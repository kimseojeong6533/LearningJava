package fileInputOutputStreamWithByteArray;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	
	public static void main(String[] args) {
		System.out.println("알파벳을 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			
			InputStreamReader irs = new InputStreamReader(System.in);  // 바이트단위 입력 -> 문자로 바꿔줌 (한글 인코딩 포함) 
			
			while((i = irs.read()) != '\n') {   //  read()의 반환값의 범위가 0~255와 -1(파일의 끝일때)
				
				System.out.print((char)i);       
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
