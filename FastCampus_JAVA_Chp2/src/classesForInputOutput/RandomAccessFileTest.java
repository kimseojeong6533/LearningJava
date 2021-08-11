package classesForInputOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 
 <RandomAccessFile클래스>
 - 입출력 클래스 중, 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스 -> (LP판 축전기의 바늘과 비슷함)
 - 파일 포인터(.getFilePointer)를 이용해 읽고 쓰는 위치의 이동이 가능(seek메서드) 
 
 */

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");  // 파일이 없으면 자동으로 생성
		
		rf.writeInt(100);
		System.out.println("pos : "+rf.getFilePointer()); // 0 + Int(4바이트) = 4
		rf.writeDouble(3.14);
		System.out.println("pos : "+rf.getFilePointer()); // 4 + Double(8바이트) = 12
		rf.writeUTF("안녕하세요");
		System.out.println("pos : "+rf.getFilePointer()); // 12 + (3*5 + 2) = 29 
         // JAVA에서 한글 : modified UTF8사용 -> 한글 3바이트씩  + String은 마지막에 Null Character ('\0', 2바이트)가 추가
		//  되므로 총, 17바이트
		
		System.out.println();
		// 이때, rf 포인터가 맨마지막을 가리키므로, read를 하려면, 포인터 위치를 바꾸어 주어야함.
		rf.seek(0);    // rf포인터의 위치를 0인덱스(맨앞)로 옮김
		int i = rf.readInt();                       // Write할 때의 입력 형이 같아야 함.
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		

	}

}
