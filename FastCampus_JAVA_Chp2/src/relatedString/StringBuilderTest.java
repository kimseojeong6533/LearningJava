package relatedString;

//���� ������ ���α׷� -> String Builder   
// ��Ƽ ������ ���α׷� -> String Buffer(����ȭ ���� -> �޸� ������Ȳ��, ������ ������)

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		
		
		buffer.append(android);   // "java" + "android"
		System.out.println(System.identityHashCode(buffer));  // ���� �޸��ּ� Ȯ��
		String test = buffer.toString();
		System.out.println(test);

	}

}
