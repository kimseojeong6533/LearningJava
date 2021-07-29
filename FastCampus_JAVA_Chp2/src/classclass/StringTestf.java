package classclass;

import java.lang.reflect.Constructor;

import com.sun.jdi.Method;

/**
 �ڹ��� ��� Ŭ������ �������̽��� ������ �� class ������ ������
 Class Ŭ������ ������ �� class ������ �ε��Ͽ� ��ü�� ���� �ε��ϰ�, ������ �������� �޼��尡 ������
 => Class.forName("Ŭ���� �̸�") �޼���� Ŭ������ �������� �ε� ��
 */


public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");    // �������� Ŭ������ �ε�
		Constructor[] cons = c.getConstructors();
		
		for(Constructor co: cons)
			System.out.println(co);
		
		java.lang.reflect.Method[] m = c.getMethods();
		
		for(java.lang.reflect.Method me : m)
			System.out.println(me);

		
		
 	}

}
