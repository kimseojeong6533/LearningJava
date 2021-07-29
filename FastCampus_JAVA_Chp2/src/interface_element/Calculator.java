package interface_element;

public abstract class Calculator implements Calc{  // 인터페이스를 구현하는 클래스 -> implements 

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	
	

}
