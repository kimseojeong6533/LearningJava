package polymorphism;

/**
 일반 고객(Customer) 클래스 구현 : 
  고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
  일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립

 */

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade = "SILVER";
	protected int bonusPoint=0;
	double bonusRatio = 0.01;
	
	public Customer() {
		System.out.println("Customer call");
		
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다"; 
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}


