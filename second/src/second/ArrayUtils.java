package second;
import java.util.Arrays;

public class ArrayUtils {

	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		Arrays.fill(ar1, 9);  // ar1배열의 초깃값을 7로 초기화
		System.arraycopy(ar1, 2, ar2, 3, 7);  // ar1의 0번재부터 읽고, 3번 인덱스부터 5개 까지 copy해서 ar2에 넣어줌.
		
		
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ar2.length;i++) {
			System.out.print(ar2[i]+" ");
		}

	}

}
