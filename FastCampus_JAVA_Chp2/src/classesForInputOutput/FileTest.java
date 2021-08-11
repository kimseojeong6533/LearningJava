package classesForInputOutput;

import java.io.File;
import java.io.IOException;

/**
 <여러가지 입출력을 위한 클래스>
 File클래스 : 
  - 파일개념을 추상화한 클래스
  - 입출령기능은 X, 파일의 이름, 경로, 읽기 전용 등 속성을 알 수 있는 메소드가 제공됨
  
 */

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\FastCampus_JAVA_Chp2\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		//file.delete();

		
	}

}
