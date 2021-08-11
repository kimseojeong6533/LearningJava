package bozoStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		
		//data.txt파일을 생성하고 아래와같이 쓰기
		try(FileOutputStream fos = new FileOutputStream("data.txt")) {

			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("파일쓰기 END");
		System.out.println();
		
		//data.txt파일을 읽기
		try(FileInputStream fis = new FileInputStream("data.txt")){
			
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());

			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
