package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 <����ȭ, Serialization> 
 : �ν��Ͻ� ���¸� �״�� ���� �Ǵ� ��Ʈ��ũ�� �����ϰ� �̸� �ٽ� ����(deserialize)�ϴ� ���
  -> JAVA������ ������Ʈ���� Ȱ���Ͽ� ����ȭ�� ����(ObjectInputStream,  ObjectOutputStream)
  
  * Serialize �������̽� : 
    - ����ȭ�� �ν��Ͻ� ������ �ܺη� ����Ǵ� ���̹Ƿ�, ���α׷��Ӱ� �ش� ��ü�� ���� ����ȭ �ǵ��� ǥ���ؾ���. ��, �ν��Ͻ� Ŭ���� �ڵ忡 implements Serializeble �ؾ���.
    - �����ڵ尡 ���� marker Interface (implements��, ���� �������̵� ���� �ʾƵ� ��)
    - transient : ����ȭ���� �������� ��������� ��� (Socket �� ����ȭ �� �� ���� ��ü) Ex. transient String job
       -> �ش� ��������� nulló�� ��
       
   * Externalizable �������̽� : 
     - ���α׷��Ӱ� ���� ��ü�� �а� ���� �ڵ带 �����ϰ��� �Ҷ� ���
     - writeExternal()�� readExternal()�޼��带 �����ؾ���.
 */

class PersonExternal implements Externalizable{
	
	String name;
	String job;
	public PersonExternal() {}
	
	public PersonExternal(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
		
		
	}
}

public class SerializationTest_Externalizable {

	public static void main(String[] args) {
		
		PersonExternal personLee = new PersonExternal("�̼���","��ǥ�̻�");
		PersonExternal personKim = new PersonExternal("������","���̻�");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt")) {   //serial.txt�� �ν��Ͻ� ��ü������ ���� ����
			ObjectOutputStream oos = new ObjectOutputStream(fos);         // ObjectOutput(FileOutputStream)
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fos = new FileInputStream("serial.txt")) {
			ObjectInputStream ois = new ObjectInputStream(fos);
			PersonExternal pLee = (PersonExternal) ois.readObject();  // readObject : ���ϳ� ����ȭ�� ������ �ν��Ͻ������� �����ϴ� �Լ�
			PersonExternal pKim = (PersonExternal) ois.readObject(); //  Object������ ��ȯ�ǹǷ� Person������ ĳ����
			
			System.out.println(pLee);
			System.out.println(pKim);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
