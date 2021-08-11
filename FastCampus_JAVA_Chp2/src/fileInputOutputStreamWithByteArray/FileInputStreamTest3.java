package fileInputOutputStreamWithByteArray;

import java.io.FileInputStream;
import java.io.IOException;


// 바이트 단위 입력 스트림 이것저것 

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			// 바이트 Array를 만들어서 읽고 출력하기
			
			byte[] bs = new byte[10];              // bs Byte Array가 입출력을 위한 틀이 되는 개념 
//			while((i = fis.read(bs)) != -1) { 
//				
////				for(int ch : bs) {
////					System.out.print((char)ch);  // -> 길이가 10이므로, 10개씩 출력 (마지막 U~Z까지 바뀐 뒤, 바뀌지 않은 QRST는 그대로 출력되는 것을 확인할 수 있다)
////				}
////				System.out.println(" : " + i + "바이트 읽음");
//				
//				for(int j=0;j<i;j++) {   // 읽은 개수 만큼 출력하기  -> 위처럼 남은 QRST가 출력되지 않고 깔끔하게 출력됨.
//					System.out.print((char)bs[j]);
//				}
//				System.out.println(" : " + i + "바이트 읽음");
//			}
			
			while ( (i = fis.read(bs, 2, 8)) != -1){   // read(byteArray, offset, len) 
				System.out.println("i : "+i);
				for(int k= 0; k<i; k++){
				
				System.out.print(k + ": " + (char)bs[k]+", ");
			}
			System.out.println(": " +i + "바이트 읽음" );
		}

					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
