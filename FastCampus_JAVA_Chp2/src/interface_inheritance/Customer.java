package interface_inheritance;

public class Customer implements Buy, Sell{ // Buy와 Sell 인터페이스를 구현

	@Override
	public void sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}
	
	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("hello");
	}
	
}
