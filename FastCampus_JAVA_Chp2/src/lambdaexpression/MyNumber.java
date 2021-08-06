package lambdaexpression;

/**
 
 함수형 인터페이스 선언 : 
  - 람다식을 선언하기 위한 인터페이스.
  - 익명 함수와 매개변수만으로 구현되므로, 인터페이스는 단 하나의 메서드만을 선언해야 함.  -> @FunctionalInterface를 이용해서 내부에 여러개의 메서드를 선언하면 에러가 나도록 처리할 수 있음
 
 */


@FunctionalInterface
public interface MyNumber {
	
	int getMax(int num1, int num2);

}
