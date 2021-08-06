package lambdaexpression;

/**
 
 함수형 프로그래밍(Functional Programming: FP) : 
  - 순수함수(pure function)를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)를 주지 않도록 구현하는 방식. 
     (순수 함수란 매개변수만을 사용하여 만드는 함수)
     즉, 함수 내부에서 함수 외부에 있는 변수를 사용하지 않아 함수가 수행되더라도 외부에는 영향을 주지 않음.  
  - 함수를 기반으로 하는 프로그래밍이고 입력받는 자료 이외에 외부 자료를 사용하지 않아 여려 자료가 동시에 수행되는 병렬처리가 가능하다.
  - 함수형 프로그래밍은 함수의 기능이 자료에 독립적 즉, 동일한 자료에 대해 동일한 결과를 보장하고, 다양한 자료에 대해 같은 기능이 수행가능하다.
  - 어떻게 만드냐? 주로 인터페이스를 이용해서 구현함.
  
  
  Ex.
   - 매개 변수가 하나인 경우 자료형과 괄호 생략가능
     str ->{System.out.println(str);}
     
   - 매개변수가 두개 이상인 경우, 괄호를 생략할 수 없다.
     x, y -> {System.out.println(str);}
     
   - 실행문이 한 문장인 경우, 중괄호 생략가능
     str -> System.out.println(str);
     
   - 실행문이 한 문장이라도 return문(반환문)은 중괄호를 생략할 수 없음
     str -> return str.length();  // 오류발생
     
   - 실행문이 한 문장의 반환문인 경우엔 return과 중괄호를 모두 생략
     (x,y) -> x+y;
     str -> str.length;
    
 */


public class AddTest {

	public static void main(String[] args) {
		Add addL = (x , y) -> x+y;   // lambda식 구현(인터페이스 사용)
		System.out.println(addL.add(2, 3));
		
		
		
	}

}
