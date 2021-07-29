package relatedString;

/**
 �ѹ� ������ String�� �Һ�(Immutable)
 String�� ����(concat)�ϸ�, ������ string�� ����Ǵ� ���� �ƴ϶�, ���ο� ���ڿ��� ������
 ->  ������ ���ڿ� �ν��Ͻ��� �ض߰� �� -> ����, ���ڿ� ������ �ݺ��ϸ� �޸� ���� �߻�.
 */

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");   // String �ν��Ͻ� ����  -> ���޸�
		String str2 = new String("abc");
		System.out.println(str1==str2);   //false
		
		String str3 = "abc";                         //Constant pool�� �ִ� �ּҸ� ����
		String str4 = "abc";
		System.out.println(str3==str4);    //true  ��,  str3, str3 -> "abc"
		
		String java = new String("java");
		System.out.println(System.identityHashCode(java));  
		String android = new String("android");
		java = java.concat(android);   
		System.out.println(System.identityHashCode(java));  // java��� ���������� �޸𸮰� �ٲ�� ���� Ȯ���� �� ����
		
		// ��, String�� ����(concat)�ϸ�, ������ string(java)�� ����Ǵ� ���� �ƴ϶�, ���ο� ���ڿ�("javaandroid")�� ������
		// -> ������ "java" �ν��Ͻ��� �ض߰� �� -> ����, ���ڿ� ������ �ݺ��ϸ� �޸� ���� �߻�.
		//�޸� ���� ������ ���� String Builder, String Buffer ���
		
	}

}
