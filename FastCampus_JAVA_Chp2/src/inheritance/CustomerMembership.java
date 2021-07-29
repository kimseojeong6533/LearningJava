package inheritance;

/**
 					     ��
 					
 		    �Ϲݰ�        VIP��
    * ����� Ŭ�������� ���յ��� ���� ����
    
    *����� ���� ����ұ�? 
     -> IS-A���� :  �Ϲ����� ���� - ��ü���� ���� (Employee - (Engineer, Manager,...)
     
     
      *HAS-A����(composition����) : Ŭ������ �ٸ� Ŭ������ �����ϴ� ����  (Student - Subject , �л��� �������� ������ �����Ѵ�.)
     
 
 */

public class CustomerMembership {

	public static void main(String[] args) {
		Customer customerLee = new Customer();    
		customerLee.setCustomerName("����");
		customerLee.setCustomerId(1000);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer kim = new VIPCustomer();
		kim.setCustomerName("�輭��");
		kim.setCustomerId(2000);
		kim.bonusPoint = 10000;
		System.out.println(kim.showCustomerInfo());
		
		Customer customerShin = new Customer(1002,"Shineehyeon");
		System.out.println(customerShin.showCustomerInfo());
		
		VIPCustomer Park = new VIPCustomer(10001,"Parksin");
		System.out.println(Park.showCustomerInfo());
		
		
		Customer vc = new VIPCustomer();  
		Customer vc2 = new VIPCustomer(10003,"Hong");  
		// VIPCustomer() �����ڿ� ���� VIPŬ������ ��� �������(customerGrade,, bonusRatio, salesRatio)�� ���� �޸𸮴� �����Ǿ�����, 
		// ������ Ÿ���� Customer �̹Ƿ� ���� ���� ������ ������ �޼���� Customer�� ������ �޼�����. (VIPCustomer�� ������ �޼��忡 ���� �Ұ�)
		// VIPCustomer()�� �ν��Ͻ��� Customer������ ����ȯ�� �����ϴ�
		// ��, ����Ŭ���� �ν��Ͻ��� ����Ŭ���� ������ ����ȯ ���� = up casting (���� Ŭ���� : ����Ŭ���� �Ӽ� + �߰� �Ӽ�)
     	// Ŭ����1 <-- Ŭ����2 <--Ŭ����3 �� ���, Ŭ����3���� Ŭ����1 �Ǵ� Ŭ����2�� ��ĳ������ �����ϴ�. (�������� ���̿� ������� ������� ����Ŭ������ ĳ���� ����)

	}

}
