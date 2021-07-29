package polymorphism;

/**
 �Ϲ� ��(Customer) Ŭ���� ���� : 
  ���� �Ӽ� : �� ���̵�, �� �̸�, �� ���, ���ʽ� ����Ʈ, ���ʽ� ����Ʈ ��������
  �Ϲ� ���� ��� ��ǰ ���Ž� 1%�� ���ʽ� ����Ʈ ����

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
		return customerName+"���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�"; 
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


