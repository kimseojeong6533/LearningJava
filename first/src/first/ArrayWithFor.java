package first;

public class ArrayWithFor {

	public static void main(String[] args) {
		int [] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
		for(int i = 0; i < iarray.length; i++) {  // 배열명.length (배열의 크기)
			iarray[i] = i+1;
		}
		
		int sum = 0;
		for(int i = 0;i < iarray.length;i++) {
			sum += iarray[i];
			
		}
		System.out.println(sum);
		
		

	}

}
