package reduce_exercise;

import java.util.Arrays;
import java.util.function.BinaryOperator;


/**
 Reduce연산 : 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 이용
 						 - 형태 : T reduce(T identify, BinaryOperator<T> accumulator)
                         - 최종연산으로 스트림의 요소를 소모하며 연산수행
                         
                         ex. Arrays.stream(arr).reduce(0, (a,b)->a+b));    (배열의 모든 요소를 더하는 reduce연산)
                               -> reduce((초깃값), 람다식))을 이용해 구현가능
                               이때, 람다식이 너무 길거나 복잡해지면 BinaryOperator를 구현한 클래스를 사용. 
 

 */
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) 
			return s1;  //스트림을 소모시키면서 두개의 문자열을 비교 -> 두 문자열의 length중 긴 문자열을 리턴
		else return s2;
		
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String greetings[] = {"안녕하세요~~~","hello","Good morning","반갑습니다"};
		
		// * String.getBytes() : String을 바이트코드로 인코딩해주는 메소드(한글 정보 유지위함) 
		String s = "GoodBYe";
		System.out.println(s.length());                   // 1)
		System.out.println(s.getBytes().length);  // 2)    => 1)과 2)가 같은 결과
		
		System.out.println();
		// greetings에서 가장 문자열의 길이가 긴 단어를 출력
		
		// 1) reduce + 람다식을 이용
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> 
				{if (s1.getBytes().length >= s2.getBytes().length) return s1;  //스트림을 소모시키면서 두개의 문자열을 비교 -> 두 문자열의 length중 긴 문자열을 리턴
				else return s2;}
				));
		
		// 2) reduce + BinaryOperator인터페이스를 구현한 클래스를 이용
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
	}

}
