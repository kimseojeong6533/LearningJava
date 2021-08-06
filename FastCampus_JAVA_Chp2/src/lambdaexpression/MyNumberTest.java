package lambdaexpression;

public class MyNumberTest {

	public static void main(String[] args) {
		
		MyNumber mynumber = (x, y) -> (x > y ? x : y);   // x,y중 더 큰 값을 리턴

		
		System.out.println(mynumber.getMax(10, 20));

	}

}
