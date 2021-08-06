package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//ArrayList�� ���ڿ� �ڷ�(�̸�)�� �ְ� �̿� ���� ���� ������ �����غ���

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();  // List�� ArayList�� ����Ŭ����
		list.add("Thomas");
		list.add("Eddy");
		list.add("Jack");
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));
		System.out.println();
		list.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		list.stream().sorted().map(s -> s.length()).forEach(n -> System.out.print(n + "\t")); // n = s.length
		System.out.println();
		list.stream().filter(s -> s.length() >= 5).forEach(n -> System.out.print(n + "\t")); // ���̰� 5�̻��� ��Ҹ� ���

	}

}
