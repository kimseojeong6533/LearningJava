package polymorphism;

/**
 우수 고객(VIPCustomer) 구현 (매출에 더 많은 기여를 하는 단골 고객)
   -제품을 살때 10%를 할인해 줌
   -보너스 포인트는 제품 가격의 5%를 적립해 줌
   -담당 전문 상담원이 배정됨

 */

public class VIPCustomer extends Customer{
	private int agentID;  //담당 전문상담원
	String customerGrade = "VIP";
	double bonusRatio = 0.05; 
	double salesRatio=0.1;
	
	public VIPCustomer() {
		//super();                           // 상위킄래스(Customer) 생성자가 호출된후, 하위클래스(VIP Customer)가 호출됨 (WITH super()) 
		// super : 하위 클래스에서 가지는 상위 클래스에 대한 참조 값 -> super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용해 상위 클래스의 메서드나 멤버 변수에 접근할 수 있음
		 
		
		System.out.println("VIP Customer() 생성");   
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId,customerName);
	}
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int) (price*salesRatio);
	}
	
	public int getAgentId() {
		return agentID;
	}
	
	
}
