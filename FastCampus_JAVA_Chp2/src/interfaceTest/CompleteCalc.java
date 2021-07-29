package interfaceTest;

public class CompleteCalc extends Calculator {

	@Override
	public int mul(int x, int y) {
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		if(y==0)
			return ERROR;
		else
			return (x/y);
	}
	public void printNum(int x, int y) {
		System.out.println("첫번째 수 : "+x);
		System.out.println("두번째 수 : "+y);
	}

}
