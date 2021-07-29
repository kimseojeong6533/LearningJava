package classclass;

import java.lang.reflect.Constructor;

import com.sun.jdi.Method;

/**
 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
 Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨
 => Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함
 */


public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");    // 동적으로 클래스를 로딩
		Constructor[] cons = c.getConstructors();
		
		for(Constructor co: cons)
			System.out.println(co);
		
		java.lang.reflect.Method[] m = c.getMethods();
		
		for(java.lang.reflect.Method me : m)
			System.out.println(me);

		
		
 	}

}
