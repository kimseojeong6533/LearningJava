package interface_inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
		System.out.println();
		Buy buyer = customer;  // ������ ����ȯ
		buyer.buy();   // buyer ���������� Buy �������̽��� ���ǵ� �޼��常 ��밡�� ��, buy(), order()�� CustomerŬ�������� �����ǵ� �Լ��� ȣ���.
		buyer.order(); 
		
		System.out.println();
		Sell seller = customer;  // seller ���������� Sell �������̽��� ���ǵ� �޼��常 ��밡�� 
		seller.sell();     // CustomerŬ�������� �����ǵ� sell(), order()�Լ��� ȣ���. 
		seller.order();
		
	}

}
