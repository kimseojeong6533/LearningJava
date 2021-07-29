package classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class c1 = Class.forName("classclass.Person");
		
		Person person = (Person)c1.newInstance();   // new 대신, 동적으로? 
		person.setName("Lee");
		System.out.println(person);  
		
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);  // null
		
		// 생성자로 
		Class[] parameterTypes = {String.class};   //c2클래스의 생성자 를 알아서 찾아줌.
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"kim"};
		Person kimp = (Person)cons.newInstance(initargs);
		System.out.println(kimp);
		
		Person kim2 = new Person("Kim");   //위에는 Person이란 클래스를 모르고, 생성자를 찾아 인스턴스를 생성할 때 class클래스를 활용함
		

	}

}
