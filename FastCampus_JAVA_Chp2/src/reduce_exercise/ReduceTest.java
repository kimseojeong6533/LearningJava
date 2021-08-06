package reduce_exercise;

import java.util.Arrays;
import java.util.function.BinaryOperator;


/**
 Reduce���� : ���ǵ� ������ �ƴ� ���α׷��Ӱ� ���� ������ ������ �̿�
 						 - ���� : T reduce(T identify, BinaryOperator<T> accumulator)
                         - ������������ ��Ʈ���� ��Ҹ� �Ҹ��ϸ� �������
                         
                         ex. Arrays.stream(arr).reduce(0, (a,b)->a+b));    (�迭�� ��� ��Ҹ� ���ϴ� reduce����)
                               -> reduce((�ʱ갪), ���ٽ�))�� �̿��� ��������
                               �̶�, ���ٽ��� �ʹ� ��ų� ���������� BinaryOperator�� ������ Ŭ������ ���. 
 

 */
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) 
			return s1;  //��Ʈ���� �Ҹ��Ű�鼭 �ΰ��� ���ڿ��� �� -> �� ���ڿ��� length�� �� ���ڿ��� ����
		else return s2;
		
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String greetings[] = {"�ȳ��ϼ���~~~","hello","Good morning","�ݰ����ϴ�"};
		
		// * String.getBytes() : String�� ����Ʈ�ڵ�� ���ڵ����ִ� �޼ҵ�(�ѱ� ���� ��������) 
		String s = "GoodBYe";
		System.out.println(s.length());                   // 1)
		System.out.println(s.getBytes().length);  // 2)    => 1)�� 2)�� ���� ���
		
		System.out.println();
		// greetings���� ���� ���ڿ��� ���̰� �� �ܾ ���
		
		// 1) reduce + ���ٽ��� �̿�
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> 
				{if (s1.getBytes().length >= s2.getBytes().length) return s1;  //��Ʈ���� �Ҹ��Ű�鼭 �ΰ��� ���ڿ��� �� -> �� ���ڿ��� length�� �� ���ڿ��� ����
				else return s2;}
				));
		
		// 2) reduce + BinaryOperator�������̽��� ������ Ŭ������ �̿�
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
	}

}
