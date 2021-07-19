package first;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 5000;
		long y = x;    // 크기가 더 작은 타입형(int)의 변수를 더 큰타입(long)으로 바꿀 때에는 묵시적으로 형변환이 일어남.
		System.out.println(y);
		
		long x2 = 5;
		// int y2 = x2;   이렇게 하면 컴파일러는 오류를 발생 시킴.
		int y2 = (int)x2;  // 크기가 더 큰 타입형의 변수를 더 작은 타입으로 바꿀때에는 명시적으로(int) 형변환을 시켜주어야 함.
		System.out.println(y2);
		

	}

}
