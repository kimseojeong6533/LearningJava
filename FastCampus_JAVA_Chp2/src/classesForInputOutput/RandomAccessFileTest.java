package classesForInputOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 
 <RandomAccessFileŬ����>
 - ����� Ŭ���� ��, �����ϰ� ���Ͽ� ���� �Է°� ����� ���ÿ� �� �� �ִ� Ŭ���� -> (LP�� �������� �ٴð� �����)
 - ���� ������(.getFilePointer)�� �̿��� �а� ���� ��ġ�� �̵��� ����(seek�޼���) 
 
 */

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");  // ������ ������ �ڵ����� ����
		
		rf.writeInt(100);
		System.out.println("pos : "+rf.getFilePointer()); // 0 + Int(4����Ʈ) = 4
		rf.writeDouble(3.14);
		System.out.println("pos : "+rf.getFilePointer()); // 4 + Double(8����Ʈ) = 12
		rf.writeUTF("�ȳ��ϼ���");
		System.out.println("pos : "+rf.getFilePointer()); // 12 + (3*5 + 2) = 29 
         // JAVA���� �ѱ� : modified UTF8��� -> �ѱ� 3����Ʈ��  + String�� �������� Null Character ('\0', 2����Ʈ)�� �߰�
		//  �ǹǷ� ��, 17����Ʈ
		
		System.out.println();
		// �̶�, rf �����Ͱ� �Ǹ������� ����Ű�Ƿ�, read�� �Ϸ���, ������ ��ġ�� �ٲپ� �־����.
		rf.seek(0);    // rf�������� ��ġ�� 0�ε���(�Ǿ�)�� �ű�
		int i = rf.readInt();                       // Write�� ���� �Է� ���� ���ƾ� ��.
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		

	}

}
