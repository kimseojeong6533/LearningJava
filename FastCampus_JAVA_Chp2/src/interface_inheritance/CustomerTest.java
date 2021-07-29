package interface_inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
		System.out.println();
		Buy buyer = customer;  // 묵시적 형변환
		buyer.buy();   // buyer 참조변수는 Buy 인터페이스에 정의된 메서드만 사용가능 단, buy(), order()는 Customer클래스에서 재정의된 함수로 호출됨.
		buyer.order(); 
		
		System.out.println();
		Sell seller = customer;  // seller 참조변수는 Sell 인터페이스에 정의된 메서드만 사용가능 
		seller.sell();     // Customer클래스에서 재정의된 sell(), order()함수가 호출됨. 
		seller.order();
		
	}

}
