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
 <직렬화, Serialization> 
 : 인스턴스 상태를 그대로 저장 또는 네트워크로 전송하고 이를 다시 복원(deserialize)하는 방식
  -> JAVA에서는 보조스트림을 활용하여 직렬화를 제공(ObjectInputStream,  ObjectOutputStream)
  
  * Serialize 인터페이스 : 
    - 직렬화는 인스턴스 내용이 외부로 유출되는 것이므로, 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야함. 즉, 인스턴스 클래스 코드에 implements Serializeble 해야함.
    - 구현코드가 없는 marker Interface (implements시, 따로 오버라이딩 하지 않아도 됨)
    - transient : 직렬화하지 않으려는 멤버변수에 사용 (Socket 등 직렬화 할 수 없는 객체) Ex. transient String job
       -> 해당 멤버변수는 null처리 됨
       
   * Externalizable 인터페이스 : 
     - 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현하고자 할때 사용
     - writeExternal()과 readExternal()메서드를 구현해야함.
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
		
		PersonExternal personLee = new PersonExternal("이순신","대표이사");
		PersonExternal personKim = new PersonExternal("김유신","상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt")) {   //serial.txt에 인스턴스 객체내용을 쓰는 과정
			ObjectOutputStream oos = new ObjectOutputStream(fos);         // ObjectOutput(FileOutputStream)
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fos = new FileInputStream("serial.txt")) {
			ObjectInputStream ois = new ObjectInputStream(fos);
			PersonExternal pLee = (PersonExternal) ois.readObject();  // readObject : 파일내 직렬화가 가능한 인스턴스내용을 복원하는 함수
			PersonExternal pKim = (PersonExternal) ois.readObject(); //  Object형으로 반환되므로 Person형으로 캐스팅
			
			System.out.println(pLee);
			System.out.println(pKim);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
