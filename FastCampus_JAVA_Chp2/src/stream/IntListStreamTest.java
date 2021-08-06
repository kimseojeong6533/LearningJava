package stream;

import java.util.ArrayList;
import java.util.List;

public class IntListStreamTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(10);
		list.add(100);
		list.add(102);
		list.add(1000);
		list.add(10000);
		
		long cnt = list.stream().count();  // count : list개수를 long형으로 리턴
		System.out.println("list개수 : "+cnt);
		
		System.out.println(list.stream().mapToInt(n -> n.intValue()).sum()); // sum과 같이 최종연산을 위해서는 mapToInt를 이용해서 정수변환을 명시적으로 해주어야 함.
	
		
		
		

	}

}
