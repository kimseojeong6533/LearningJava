package second;


/**
 == ������ : ���������� �������� �� -> �� �ν��Ͻ��� ������ ���Ϸ��� equals�̶�� �޼ҵ带 �������̵��Ͽ� ���
 */

class Inum{
	private int num;
	public Inum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num==((Inum)obj).num)
			return true;
		else
			return false;
	}
}

public class ObjectEquality {

	public static void main(String[] args) {
		Inum num1 = new Inum(3);
		Inum num2 = new Inum(3);
		Inum num3 = new Inum(4);
		
		if (num1.equals(num2)){
			System.out.println("num1�� num2�� �ν��Ͻ� ������ �����ϴ�.");
		}
		else {
			System.out.println("num1�� num2�� �ν��Ͻ� ������ �ٸ��ϴ�.");
		}
		System.out.println();
		
		if (num1.equals(num3)){
			System.out.println("num1�� num3�� �ν��Ͻ� ������ �����ϴ�.");
		}
		else {
			System.out.println("num1�� num3�� �ν��Ͻ� ������ �ٸ��ϴ�.");
		}
		
			

	}

}