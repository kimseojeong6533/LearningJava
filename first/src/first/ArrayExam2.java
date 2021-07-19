package first;

public class ArrayExam2 {

	public static void main(String[] args) {
		int [][] array4 = new int[3][4];
		
		array4[0][0] = 10;
		
		int [][] array5 = new int [3][];
		array5[0] = new int [1];      
		array5[0] = new int [2];
		array5[0] = new int [3];   
		
		int[][] array6 = {{0},{1,2},{3,4,5}};
		System.out.println(array6[1][1]);
		

	}

}
