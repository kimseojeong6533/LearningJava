package second;

/**
 * <��� ���迡�� �޼ҵ� ȣ�⹮��>
 GrandParent(void Talking()...)<--- Parent(p){void MakeMoney()...} <--- Son(s) {void Study()...}  
 
 ����Ŭ���� ��������(p)�� ����Ŭ������ �ν��Ͻ�(s)�� ��������.
 but, ����Ŭ���� ��������(p)�� ����Ŭ������ ���ǵ� �޼ҵ� ȣ��(Study())�� �Ұ���. 
 *����Ŭ���� �������� p�� �ش� Ŭ������ �޼ҵ�(MakeMoney()..)�� �ش� Ŭ������ ����Ŭ����(GrandParent)�� �޼ҵ�(Talking()...)�� ȣ�Ⱑ����.
 
����Ŭ������ ���ǵ� �޼ҵ带 ����Ŭ���� ���������� ȣ���Ϸ���, ����Ŭ���� ������ ������ Ÿ��ĳ������ �ؾ���.
��, ����Ŭ������ ����Ŭ������ ���ǵ� �޼ҵ带 ȣ���ϰ� ������ => (����Ŭ������) ����Ŭ����_���������̸� 

 */

class Cake{
	int cakeNum;
	public Cake() {
		cakeNum = 0;
	}
	
	public Cake(int num) {
		cakeNum = num-1;
	}
	public void sweet() {
		System.out.println("Cake");
	}
	
}

class CheeseCake extends Cake{
	int cheeseCakenum;
	public CheeseCake() {
		super();
		cheeseCakenum = 0;
	}
	
	public CheeseCake(int num) {
		super(num);
		cheeseCakenum = num+1;
	}
	public void milky() {
		System.out.println("CheeseCake");
	}
}

class StrawberryCheeseCake extends CheeseCake{
	public void sour() {
		System.out.println("StrawberryCheeseCake");
	}
}

public class YummyCakeOveriding {

	public static void main(String[] args) {
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1;
		ca2.sweet();  // ����Ŭ������ ���������� �ش� Ŭ������ �޼ҵ�ȣ���� ����
		//ca2.milky()  //<- ����,  ���� Ŭ������ �޼ҵ�� ȣ�� �Ұ�
		
		Cake ca3 = new CheeseCake();  // ����Ŭ������ ���������� ����Ŭ���� �ν��Ͻ��� ��������.
		//CheeseCake ca4 = ca3; // <- ����, ����Ŭ������ ���������� ����Ŭ���������� ���ǵ� ���������� ����x
		CheeseCake ca4 = (CheeseCake) ca3; // ����Ŭ������ ���������� ����Ŭ���������� Ÿ��ĳ�����ϸ�, ����Ŭ������ ���������� �ش� ���������� ���ٰ���
		ca4.milky();
		ca4.sweet();    // � Ŭ������ ���������� �ش� Ŭ������ �޼ҵ� + �ش� Ŭ������ ����Ŭ������ �޼ҵ� ��� ȣ�Ⱑ��
		
		System.out.println();
		
		
		/**
		 <�����ϱ���� �������� ����>
		 CheeseCake ca1 = new CheeseCake();  // ca2�� CheeseCake��ü����, Cake��ü�̴�.
		Cake ca2 = ca1;   // ����, Cake�� ���������� ca2(CheeseCake �ν��Ͻ�)�� �����ϴ� ���� �����ϴ�.
		                                //  ������Ŭ������ ���������� ����Ŭ������ �ν��Ͻ��� ������ �� �����Ƿ� 
		ca2.sweet(); 
		ca2.milky();  // ��, ca2�� Cake(����Ŭ����) �ν��Ͻ��̱� ������, CheeseCake �޼ҵ忡 �����ϴ� ���� �Ұ����ϴ�.
		
		Cake ca3 = new CheeseCake();  // ca3�� CakeŬ������ ���������̹Ƿ�, ���� Ŭ������ CheeseCakeŬ������ ���ٰ����ϴ�.
		//CheeseCake ca4 = ca3;  // �׷���, ����Ŭ���� �������� ca4�� ���� Ŭ���� ���������� ca3�� �������� ���Ѵ�? 
		CheeseCake ca4 = (CheeseCake) ca3; // �׷��� ����Ŭ���� ���������� ���������� ����Ŭ���� ������ ���ٲ��� ���ָ�, ����Ŭ���� �޼ҵ���� ���ٰ����ϴ�.
		ca4.milky();
		
		Cake ca5 = new CheeseCake(5);   // Cake(����Ŭ����)�������� ca5�� ����Ŭ������ ������ �� �ֵ��� ����.
		System.out.println(ca5.cakeNum);
		CheeseCake ca6 = (CheeseCake)ca5;  // CheeseCake(����Ŭ����) �������� ca6�� 
		System.out.println(ca6.cheeseCakenum);
		ca6.milky();
		
		CheeseCake ca1 = new CheeseCake();  // ca2�� CheeseCake��ü����, Cake��ü�̴�.
		Cake ca2 = (Cake) ca1;   // ����, Cake�� ���������� ca2(CheeseCake �ν��Ͻ�)�� �����ϴ� ���� �����ϴ�.
		                                //  ������Ŭ������ ���������� ����Ŭ������ �ν��Ͻ��� ������ �� �����Ƿ� 
		ca2.sweet(); 
		//ca2.milky();  // ��, ca2�� Cake(����Ŭ����) �ν��Ͻ��̱� ������, CheeseCake �޼ҵ忡 �����ϴ� ���� �Ұ����ϴ�.

		 */

	}

}