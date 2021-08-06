package stream;

/**
 스트림(Stream)이란?
  - 배열, 컬렉션을 대상으로, 자료처리를 쉽고 간단하게 할 수 있도록 연산을 수행
  - 스트림 연산은 기존 자료를 변경하지 않음 -> 자료에 대해 스트림을 생성하면, 스트림이 사용하는 메모리 공간은 별도로 생성되므로 연산이 수행되어도 기존 자료에 대한 변경X
  - 한번 생성하고 사용한 스트림은 재사용 할 수 없음 -> 스트림에 대한 연산 수행시, 스트림이 '소모'됨. 따라서 생성한 스트림에 대해 다른 연산을 수행하려면 다시 스트림을 생성해야함.
   
 * 스트림 연산은 중간 연산과 최종 연산으로 구분 됨
   - 스트림에 대해 중간 연산은 여러 개의 연산이 적용될 수 있지만 최종 연산은 마지막에 한 번만 적용됨
   - 중간 연산과 최종 연산에 대한 구현은 람다식을 활용함
   - 최종연산이 호출되어야 중간 연산에 대한 수행이 이루어 지고 그 결과가 만들어짐
      따라서 중간 연산에 대한 결과를 연산 중에 알수 없음. 이를 '지연 연산'이라 함
      
   Ex 1. 문자열리스트에서 길이가 5이상인 요소를 출력 (filter - 중간연산, forEach - 최종연산) 
     =>   sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
   
   Ex 2. 고객 클래스 배열에서 고객 이름만 가져오기
     =>  customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
                
           
  * 중간 연산의 예 - filter(), map(), sorted()   <- 조건에 맞는 요소를 추출(filter)하거나 요소를 변환 함(map)
     -  최종 연산이 호출될 때 중간 연산이 수행되고 결과가 생성 됨
 
  * 최종 연산의 예 -  forEach(), count(), sum() 등
     - 스트림이 관리하는 자료를 하나씩 소모해가며 연산이 수행.
     
 */


import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	
	public static void main(String[] args) {
		
		// 일반적인 배열 출력
		int [] arr = {1,2,3,4,5};
		for(int e :arr)
			System.out.println(e);
		
		System.out.println();
		
		//Stream을 활용해 배열 출력(모든 array는 Arrays클래스 사용가능)
		//Arrays.stream(arr).forEach(n -> System.out.println(n));  
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n)); 		
		//System.out.println(is.count()); // 오류 왜? 한번 생성된 스트림은 재사용 할수 없음 -> 배열이나 컬렉션을 다시 사용하려면 스트림을 다시 선언해주어야함
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);  
		
	}
	
	

}
