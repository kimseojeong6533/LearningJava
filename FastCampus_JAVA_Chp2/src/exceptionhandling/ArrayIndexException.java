package exceptionhandling;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
		for(int i=0;i<=5;i++)                    // i = 0 ~ 5까지 이므로, ArrayIndexOut 발생 
			System.out.println(arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {  // 
			System.out.println(e.getMessage()); 
			System.out.println(e.toString());    // Exception종류를 출력
		}
		
		System.out.println("here!");                 // catch문에서 예외를 처리하고 비정상종료되지 않았기 때문에, here!!가 출력될 수 있음. 
	}

}
