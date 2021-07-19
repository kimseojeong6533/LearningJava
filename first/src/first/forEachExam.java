package first;

public class forEachExam {

	public static void main(String[] args) {
		int[] iarr = {10,20,30,40,50};
		
		for(int i=0;i<iarr.length;i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		System.out.println("\n");
		
		for(int value:iarr) {  //   foreach   =>   for(타입값을 받아줄 변수명 : 출력하고싶은 자료구조)   
			System.out.println(value);
		}
		
		// 2차원배열 foreach로 출력하기
		int[][] arr2 = {{1},{1,2},{1,2,3}};
		for(int[] sub:arr2) {
			for(int i:sub) {
				System.out.println(i);
			}
		}
		
	}
	
}
