package polymorphism;

import java.util.ArrayList;

/**
 		// VIPCustomer() 생성자에 의해 VIP클래스의 모든 멤버변수(customerGrade,, bonusRatio, salesRatio)에 대한 메모리는 생성되었지만, 
		// 변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드임. (VIPCustomer의 변수와 메서드에 접근 불가)
		// VIPCustomer()의 인스턴스는 Customer형으로 형변환이 가능하다
		// 즉, 하위클래스 인스턴스는 상위클래스 형으로 형변환 가능 = up casting (하위 클래스 : 상위클래스 속성 + 추가 속성)
     	// 클래스1 <-- 클래스2 <--클래스3 인 경우, 클래스3에서 클래스1 또는 클래스2로 업캐스팅이 가능하다. (계층구조 깊이에 상관없이 하위라면 상위클래스로 캐스팅 가능)
 
 */

public class CustomerMembership {

	public static void main(String[] args) {
		// 손님 리스트
		ArrayList<Customer> customerList = new ArrayList<Customer>();     // 다형성을 활용한 고객의 grade를 상위클래스를 이용해 핸들링
		Customer customer1 = new Customer(10010,"Thomas");
		Customer customer2 = new Customer(10011,"James");
		Customer customer3 = new GoldCustomer(10012,"Edward");
		Customer customer4 = new GoldCustomer(10013,"Percy");
		Customer customer5 = new VIPCustomer(10014,"Kim");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		for(Customer c : customerList) {
			System.out.println(c.showCustomerInfo());
		}
		System.out.println();
		System.out.println("===============고객별 할인율 및 보너스포인트 ======================");
		
		int price = 10000;
		for(Customer c: customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+"님이 "+cost+"원을 지불하였습니다.");
			System.out.println(c.getCustomerName()+"님의 현재 보너스 포인트는 "+c.bonusPoint+"입니다.");
				
		}
		System.out.println();
		System.out.println("=============== 다운캐스팅 확인해보기 ======================");
		//다운 캐스팅 : 업캐스팅된 클래스를 다시 원래의 타입으로 형변환 하는 것.
		
		Customer vc = new VIPCustomer();  //묵시적 다운캐스팅
		//VIPCustomer vc2 = (VIPCustomer) vc;  //명시적 다운캐스팅
	
		
		// vc는 VIPCustomer 인스턴스를 가리키는 Customer클래스형의 참조변수 -> VIPCustomer와 Customer 인스턴스 형이 모두 체크됨.
		if(vc instanceof VIPCustomer)   //true
			System.out.println("다운캐스팅");
		if(vc instanceof Customer)       // true
			System.out.println("다운캐스팅2");
		
		
		
		
	}

}
