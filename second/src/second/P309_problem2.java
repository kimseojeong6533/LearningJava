package second;

public class P309_problem2 {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int [] tmp = arr[0];
		
		int [][] arr2 = new int[arr.length][arr[0].length];
		for(int i=0;i<(arr.length)-1;i++) {
			arr2[i+1] = arr[i];
		}
		arr2[0] = arr[arr.length-1];
		
		for(int [] e:arr2) {
			for(int el : e)
				System.out.print(el+" ");
			System.out.println();
		}

	}

}
