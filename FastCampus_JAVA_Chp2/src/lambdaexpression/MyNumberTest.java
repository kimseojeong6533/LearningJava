package lambdaexpression;

public class MyNumberTest {

	public static void main(String[] args) {
		
		MyNumber mynumber = (x, y) -> (x > y ? x : y);   // x,y�� �� ū ���� ����

		
		System.out.println(mynumber.getMax(10, 20));

	}

}
