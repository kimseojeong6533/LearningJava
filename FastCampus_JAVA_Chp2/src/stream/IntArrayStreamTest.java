package stream;

/**
 ��Ʈ��(Stream)�̶�?
  - �迭, �÷����� �������, �ڷ�ó���� ���� �����ϰ� �� �� �ֵ��� ������ ����
  - ��Ʈ�� ������ ���� �ڷḦ �������� ���� -> �ڷῡ ���� ��Ʈ���� �����ϸ�, ��Ʈ���� ����ϴ� �޸� ������ ������ �����ǹǷ� ������ ����Ǿ ���� �ڷῡ ���� ����X
  - �ѹ� �����ϰ� ����� ��Ʈ���� ���� �� �� ���� -> ��Ʈ���� ���� ���� �����, ��Ʈ���� '�Ҹ�'��. ���� ������ ��Ʈ���� ���� �ٸ� ������ �����Ϸ��� �ٽ� ��Ʈ���� �����ؾ���.
   
 * ��Ʈ�� ������ �߰� ����� ���� �������� ���� ��
   - ��Ʈ���� ���� �߰� ������ ���� ���� ������ ����� �� ������ ���� ������ �������� �� ���� �����
   - �߰� ����� ���� ���꿡 ���� ������ ���ٽ��� Ȱ����
   - ���������� ȣ��Ǿ�� �߰� ���꿡 ���� ������ �̷�� ���� �� ����� �������
      ���� �߰� ���꿡 ���� ����� ���� �߿� �˼� ����. �̸� '���� ����'�̶� ��
      
   Ex 1. ���ڿ�����Ʈ���� ���̰� 5�̻��� ��Ҹ� ��� (filter - �߰�����, forEach - ��������) 
     =>   sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
   
   Ex 2. �� Ŭ���� �迭���� �� �̸��� ��������
     =>  customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
                
           
  * �߰� ������ �� - filter(), map(), sorted()   <- ���ǿ� �´� ��Ҹ� ����(filter)�ϰų� ��Ҹ� ��ȯ ��(map)
     -  ���� ������ ȣ��� �� �߰� ������ ����ǰ� ����� ���� ��
 
  * ���� ������ �� -  forEach(), count(), sum() ��
     - ��Ʈ���� �����ϴ� �ڷḦ �ϳ��� �Ҹ��ذ��� ������ ����.
     
 */


import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	
	public static void main(String[] args) {
		
		// �Ϲ����� �迭 ���
		int [] arr = {1,2,3,4,5};
		for(int e :arr)
			System.out.println(e);
		
		System.out.println();
		
		//Stream�� Ȱ���� �迭 ���(��� array�� ArraysŬ���� ��밡��)
		//Arrays.stream(arr).forEach(n -> System.out.println(n));  
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n)); 		
		//System.out.println(is.count()); // ���� ��? �ѹ� ������ ��Ʈ���� ���� �Ҽ� ���� -> �迭�̳� �÷����� �ٽ� ����Ϸ��� ��Ʈ���� �ٽ� �������־����
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);  
		
	}
	
	

}
