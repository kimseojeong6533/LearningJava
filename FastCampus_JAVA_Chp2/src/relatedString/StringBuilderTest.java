package relatedString;

//단일 쓰레드 프로그램 -> String Builder   
// 멀티 쓰레드 프로그램 -> String Buffer(동기화 보장 -> 메모리 공유상황시, 순서가 정해짐)

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		
		
		buffer.append(android);   // "java" + "android"
		System.out.println(System.identityHashCode(buffer));  // 같은 메모리주소 확인
		String test = buffer.toString();
		System.out.println(test);

	}

}
