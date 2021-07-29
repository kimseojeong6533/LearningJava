package relatedString;

/**
 한번 생성된 String은 불변(Immutable)
 String을 연결(concat)하면, 기존의 string에 연결되는 것이 아니라, 새로운 문자열이 생성됨
 ->  기존의 문자열 인스턴스가 붕뜨게 됨 -> 따라서, 문자열 연결을 반복하면 메모리 낭비가 발생.
 */

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");   // String 인스턴스 생성  -> 힙메모리
		String str2 = new String("abc");
		System.out.println(str1==str2);   //false
		
		String str3 = "abc";                         //Constant pool에 있는 주소를 참조
		String str4 = "abc";
		System.out.println(str3==str4);    //true  즉,  str3, str3 -> "abc"
		
		String java = new String("java");
		System.out.println(System.identityHashCode(java));  
		String android = new String("android");
		java = java.concat(android);   
		System.out.println(System.identityHashCode(java));  // java라는 참조변수의 메모리가 바뀌는 것을 확인할 수 있음
		
		// 즉, String을 연결(concat)하면, 기존의 string(java)에 연결되는 것이 아니라, 새로운 문자열("javaandroid")가 생성됨
		// -> 기존의 "java" 인스턴스가 붕뜨게 됨 -> 따라서, 문자열 연결을 반복하면 메모리 낭비가 발생.
		//메모리 낭비 방지를 위해 String Builder, String Buffer 사용
		
	}

}
