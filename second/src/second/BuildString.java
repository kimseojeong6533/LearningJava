package second;

public class BuildString {

	// StringBuilder클래스를 사용하면, 빈번하게 문자열 인스턴스가 생성하지 않게 할 수 있음. 
	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678);  // 123+45678 => 12345678 (숫자, 문자, 부울형 등 다양한 자료형을 문자열로 바꾸어 concat해줄 수 있음)
		
		
		
		System.out.println(stbuf);
		System.out.println(stbuf.toString());  // 저장된 문자열의 내용을 담은 String 인스턴스의 생성 및 반환 
		
		stbuf.delete(0, 2);  // 인덱스 0~1까지의 문자를 지움 
		System.out.println(stbuf.toString());
		
		stbuf.reverse();   // 반대로 
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2, 4);  
		System.out.println(sub);
		System.out.println();
		
		StringBuilder stb1 = new StringBuilder("135");
		StringBuilder stb2 = stb1.append(79);   // stb2는 stb1의 인스턴스를 가리크게됨 즉, stb1과 stb2는 동일한 인스턴스를 참조하게 됨. 
		
		System.out.println(stb1.toString());
		System.out.println(stb2.toString());
		
		stb2.delete(0, 2);
		System.out.println(stb1.toString());
		System.out.println(stb2.toString());
		
		if(stb1==stb2) {
			System.out.println("같은 인스턴스 참조");
		}
		else {
			System.out.println("다른 인스턴스 참조");
		}
		
		

	}

}
