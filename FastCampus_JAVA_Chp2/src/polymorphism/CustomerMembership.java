package polymorphism;

import java.util.ArrayList;

/**
 		// VIPCustomer() �����ڿ� ���� VIPŬ������ ��� �������(customerGrade,, bonusRatio, salesRatio)�� ���� �޸𸮴� �����Ǿ�����, 
		// ������ Ÿ���� Customer �̹Ƿ� ���� ���� ������ ������ �޼���� Customer�� ������ �޼�����. (VIPCustomer�� ������ �޼��忡 ���� �Ұ�)
		// VIPCustomer()�� �ν��Ͻ��� Customer������ ����ȯ�� �����ϴ�
		// ��, ����Ŭ���� �ν��Ͻ��� ����Ŭ���� ������ ����ȯ ���� = up casting (���� Ŭ���� : ����Ŭ���� �Ӽ� + �߰� �Ӽ�)
     	// Ŭ����1 <-- Ŭ����2 <--Ŭ����3 �� ���, Ŭ����3���� Ŭ����1 �Ǵ� Ŭ����2�� ��ĳ������ �����ϴ�. (�������� ���̿� ������� ������� ����Ŭ������ ĳ���� ����)
 
 */

public class CustomerMembership {

	public static void main(String[] args) {
		// �մ� ����Ʈ
		ArrayList<Customer> customerList = new ArrayList<Customer>();     // �������� Ȱ���� ���� grade�� ����Ŭ������ �̿��� �ڵ鸵
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
		System.out.println("===============���� ������ �� ���ʽ�����Ʈ ======================");
		
		int price = 10000;
		for(Customer c: customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+"���� "+cost+"���� �����Ͽ����ϴ�.");
			System.out.println(c.getCustomerName()+"���� ���� ���ʽ� ����Ʈ�� "+c.bonusPoint+"�Դϴ�.");
				
		}
		System.out.println();
		System.out.println("=============== �ٿ�ĳ���� Ȯ���غ��� ======================");
		//�ٿ� ĳ���� : ��ĳ���õ� Ŭ������ �ٽ� ������ Ÿ������ ����ȯ �ϴ� ��.
		
		Customer vc = new VIPCustomer();  //������ �ٿ�ĳ����
		//VIPCustomer vc2 = (VIPCustomer) vc;  //����� �ٿ�ĳ����
	
		
		// vc�� VIPCustomer �ν��Ͻ��� ����Ű�� CustomerŬ�������� �������� -> VIPCustomer�� Customer �ν��Ͻ� ���� ��� üũ��.
		if(vc instanceof VIPCustomer)   //true
			System.out.println("�ٿ�ĳ����");
		if(vc instanceof Customer)       // true
			System.out.println("�ٿ�ĳ����2");
		
		
		
		
	}

}
