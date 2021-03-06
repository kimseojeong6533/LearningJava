package second;

public class StringExercise {

	public static void main(String[] args) {
		
		// String1.concat(String2) : String1과 String2를 연결한 결과 반환
		String str1 = "Coffee";
		String str2 = "Bread";
		
		String str3 = str1.concat(str2);
		String str4 = "Fresh".concat(str3);
		System.out.println(str4);
		
		//Substring
		String str5 = "abcdefg";
		System.out.println(str5.substring(2));  // 2번재 문자열부터~ 끝까지 
		System.out.println(str5.substring(2,4));  // 인덱스 2부터 3까지 
		System.out.println();
		
		//문자열 값 비교
		String str6 = "my house";
		System.out.println(str6.equals("my house"));
		System.out.println(str6.equals("My House"));   // equals는 대소문자 구분함.
		System.out.println(str6.compareTo("your house"));  // str6의 m이 your house의 y보다 앞서기 때문에 0보다 작은 값이 반환됨.
		System.out.println(str6.compareToIgnoreCase("My house"));
		System.out.println();
		
		//기본 자료형의 값을 문자열로 바꾸기
		double e = 2.718281;
		String se = String.valueOf(e);  
		System.out.println(se);
		System.out.println(se.getClass().getName());  // java.lang.String으로 출력 
		
		//숫자형을 문자열로 바꾸고 다른 문자열에 연결
		System.out.println("age : ".concat(String.valueOf(7)));
		
			
		String exNum = "990925-1012999";
		System.out.println(exNum.substring(0,6)+" "+exNum.substring(7));

	}

}
