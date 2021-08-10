package packagetravelcost;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList <Customer> customerlist = new ArrayList<Customer>();
		
		
		Customer customerlee = new Customer("�̼���",40);
		Customer customerkim = new Customer("������",20);
		Customer customerhong = new Customer("ȫ�浿",13);
		
		customerlist.add(customerlee);
		customerlist.add(customerkim);
		customerlist.add(customerhong);
		
		
		// ��Ʈ���� Ȱ���� �������
		
		//1) ���� ��� ���
		System.out.println("�� ��� : ");
		customerlist.stream().forEach(s->System.out.println(s.name));
		System.out.println();
		
		//2) ������ �� ����� ���
		int total_cost = customerlist.stream().mapToInt(n -> n.getCost()).sum();  // ���������� ����Ϸ��� maptoInt�� ����ؾ���.
		System.out.println("���� �Ѻ���� : " + total_cost);
		System.out.println();
		
		//3) �� �� 20�� �̻��� ����� �̸��� �����Ͽ� ���
		
		int stdage = 20;
		System.out.printf("�� �� %d�� �̻��� ����� �̸� : \n",stdage);
		customerlist.stream().filter(s->s.getAge() >= stdage).map(c->c.getName()).sorted().forEach(a -> System.out.println(a));
		                                                 // ���س��� �̻����� ���͸�      �̸��� ������           �������̸��� ����
	}

}
