package oopversuslambda;




public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hi~!";
		String s2 = "Bye~!";
		
		//직접 클래스를 만들어서 String concat
		StringConcatImplement sc1 = new StringConcatImplement();
		sc1.makeString(s1, s2);
		
		//lambda식을 이용한 String concat
		// 실제로는 클래스생성없이  하는 것이 아님. 
		// 익명클래스가 만들어져서 사용하는 것.
		// 따라서, makeString이외 다른 메서드를 StringConcat인터페이스에 쓸 수 없음.
		StringConcat concat = (s,v) -> System.out.println(s+v);  // 인터페이스 구현
		concat.makeString(s1, s2);  
		

	}

}
