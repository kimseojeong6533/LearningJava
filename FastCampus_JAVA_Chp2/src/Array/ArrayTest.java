package Array;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = new int[10];    
		// 10�� �� ������ ���� �迭 ����(int���̹Ƿ� 4����Ʈ ¥�� 10���� ������ �����), �̶�,������ arr�̶�� ������ 10���� ������ ���� �迭�� 0���� �ε����� ����Ű�� ���������̴�. 
		
		int [] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int total = 0;
		
		for(int i=0, num=1;i<arr.length;i++) {
			arr[i] = num++;       // 1���� �����ؼ� 1�� ���� ���� arr�迭�� �־��ش�
		}

		for(int e:arr)
			System.out.println(e);
	}

}
