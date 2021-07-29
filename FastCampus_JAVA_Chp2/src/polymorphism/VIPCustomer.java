package polymorphism;

/**
 ��� ��(VIPCustomer) ���� (���⿡ �� ���� �⿩�� �ϴ� �ܰ� ��)
   -��ǰ�� �춧 10%�� ������ ��
   -���ʽ� ����Ʈ�� ��ǰ ������ 5%�� ������ ��
   -��� ���� ������ ������

 */

public class VIPCustomer extends Customer{
	private int agentID;  //��� ��������
	String customerGrade = "VIP";
	double bonusRatio = 0.05; 
	double salesRatio=0.1;
	
	public VIPCustomer() {
		//super();                           // ����������(Customer) �����ڰ� ȣ�����, ����Ŭ����(VIP Customer)�� ȣ��� (WITH super()) 
		// super : ���� Ŭ�������� ������ ���� Ŭ������ ���� ���� �� -> super�� ������ ���� Ŭ���� �ν��Ͻ��� ���� ���� �����Ƿ� super�� �̿��� ���� Ŭ������ �޼��峪 ��� ������ ������ �� ����
		 
		
		System.out.println("VIP Customer() ����");   
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
