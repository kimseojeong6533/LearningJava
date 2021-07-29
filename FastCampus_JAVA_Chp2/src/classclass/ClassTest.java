package classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class c1 = Class.forName("classclass.Person");
		
		Person person = (Person)c1.newInstance();   // new ���, ��������? 
		person.setName("Lee");
		System.out.println(person);  
		
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);  // null
		
		// �����ڷ� 
		Class[] parameterTypes = {String.class};   //c2Ŭ������ ������ �� �˾Ƽ� ã����.
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"kim"};
		Person kimp = (Person)cons.newInstance(initargs);
		System.out.println(kimp);
		
		Person kim2 = new Person("Kim");   //������ Person�̶� Ŭ������ �𸣰�, �����ڸ� ã�� �ν��Ͻ��� ������ �� classŬ������ Ȱ����
		

	}

}
