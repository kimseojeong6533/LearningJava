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
		
		long cnt = list.stream().count();  // count : list������ long������ ����
		System.out.println("list���� : "+cnt);
		
		System.out.println(list.stream().mapToInt(n -> n.intValue()).sum()); // sum�� ���� ���������� ���ؼ��� mapToInt�� �̿��ؼ� ������ȯ�� ��������� ���־�� ��.
	
		
		
		

	}

}
