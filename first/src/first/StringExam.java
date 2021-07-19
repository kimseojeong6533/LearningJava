package first;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";  // str1과 str2는 "hello"라는 문자열 변수를 참조하고 있음. 즉, 똑같은 객체를 두개의 변수가 가르키고 있는 것. 
		
		String str3 = new String("hello");   
		String str4 = new String("hello"); // str3와 str4는 "hello"라는 값만 같고 다른 객체를 가르키는 변수
		
		if (str1 == str3) {
			System.out.println("str1과 str3는 같은 인스턴스를 참조합니다.");
		}
		else {
			System.out.println("str1과 str3는 다른 인스턴스를 참조합니다.");   // String은 불변 클래스이다. 불변이란 String이 인스턴스가 될때 가지고 있던 값을 나중에 수정할 수 없다.
		}
			
		System.out.println(str3);
		System.out.println(str1.substring(3)); 
		System.out.println(str1);
		
		

	}

}
