package exceptionhandling;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
		for(int i=0;i<=5;i++)                    // i = 0 ~ 5���� �̹Ƿ�, ArrayIndexOut �߻� 
			System.out.println(arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {  // 
			System.out.println(e.getMessage()); 
			System.out.println(e.toString());    // Exception������ ���
		}
		
		System.out.println("here!");                 // catch������ ���ܸ� ó���ϰ� ������������� �ʾұ� ������, here!!�� ��µ� �� ����. 
	}

}
