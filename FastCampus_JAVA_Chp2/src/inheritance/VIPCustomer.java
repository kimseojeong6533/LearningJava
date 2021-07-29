package inheritance;

/**
 ��� ��(VIPCustomer) ���� (���⿡ �� ���� �⿩�� �ϴ� �ܰ� ��)
   -��ǰ�� �춧 10%�� ������ ��
   -���ʽ� ����Ʈ�� ��ǰ ������ 5%�� ������ ��
   -��� ���� ������ ������

 */

public class VIPCustomer extends Customer{
	private int agentID;  //��� ��������
	double salesRatio;
	
	public VIPCustomer() {
		//super();                           // ����������(Customer) �����ڰ� ȣ�����, ����Ŭ����(VIP Customer)�� ȣ��� (WITH super()) 
		// super : ���� Ŭ�������� ������ ���� Ŭ������ ���� ���� �� -> super�� ������ ���� Ŭ���� �ν��Ͻ��� ���� ���� �����Ƿ� super�� �̿��� ���� Ŭ������ �޼��峪 ��� ������ ������ �� ����
		 
		customerGrade = "VIP";
		bonusRatio = 0.05; 
		salesRatio = 0.1;
		System.out.println("VIP Customer() ����");   
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId,customerName);
	}
	
	public int getAgentId() {
		return agentID;
	}
	
	
}
