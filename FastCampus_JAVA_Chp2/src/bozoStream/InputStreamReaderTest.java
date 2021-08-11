package bozoStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 
 <보조스트림> : 실제 읽고 쓰는 스트림(FileInputStream, FileReader, FileOutputStream, FileWriter 등)이 아닌 보조기능을 제공하는 스트림이다.
 - FilterInputStream과 FilterOutputStream이 보조 스트림의 상위 클래스들임
 - 생성자의 매개변수로 또 다른 스트림(기반 스트림이나 다른 보조 스트림)을 가짐  -> Ex. (new InputStreamReader(new FileInputStream))
 - Decorator Pattern으로 구성됨.
 - 대표적으로, 문자로 변환하는 보조스트림(InputStreamReader, OutputStreamReader), 버퍼링 기능을 추가하는 보조스트림(BufferedInputStream, BufferedOutputStream)이 있다. 
 
 **/


public class InputStreamReaderTest {

	public static void main(String[] args) {
		//reader : 안녕하세요 가 쓰여있는 파일
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){   // FileInputStream을 InputStreamReader라는 보조스트림으로 감쌈
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
