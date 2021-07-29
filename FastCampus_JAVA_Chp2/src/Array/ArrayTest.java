package Array;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = new int[10];    
		// 10개 의 공간을 가진 배열 생성(int형이므로 4바이트 짜리 10개의 공간이 생긴것), 이때,실제로 arr이라는 변수는 10개의 공간을 가진 배열의 0번재 인덱스를 가리키는 참조변수이다. 
		
		int [] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int total = 0;
		
		for(int i=0, num=1;i<arr.length;i++) {
			arr[i] = num++;       // 1부터 시작해서 1씩 더한 값을 arr배열에 넣어준다
		}

		for(int e:arr)
			System.out.println(e);
	}

}
