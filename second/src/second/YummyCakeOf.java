package second;
/**
 ex)  if (ca instanceof Cake) ����
   ca : ��������, Cake : Ŭ������ �̸�
   => ca�� �����ϴ� �ν��Ͻ��� CakeŬ������ �ν��Ͻ��̰ų� Cake�� ����ϴ� Ŭ����(Cake�� ����Ŭ����)�� �ν��Ͻ��� ��� True��ȯ �ƴϸ� False
  Parent ����Ŭ����(p) <--- Son ����Ŭ����(s)
 
 */

class Cake3{	
}

class CheeseCake3 extends Cake3{
}

class StrawberryCheeseCake3 extends CheeseCake3{
}

public class YummyCakeOf {

	public static void main(String[] args) {
		Cake3 c = new StrawberryCheeseCake3();  // �������� c�� �����ϴ� �ν��Ͻ��� StrawberryCheeseCake3Ŭ������ �ν��Ͻ�
		Cake3 c2 = new Cake3();
		
		if(c2 instanceof Cake3) {   // StrawberryCheeseCake3�� ���� Ŭ������ ����Ŭ������ Cake3�̹Ƿ� True
			System.out.println("�����ν��Ͻ� or");
			System.out.println("���� ����ϴ� �ν��Ͻ�");
			System.out.println();
		}
		if(c2 instanceof CheeseCake3) {  // StrawberryCheeseCake3�� ����Ŭ������ CheeseCake3�̹Ƿ� true
			System.out.println("ġ�������ν��Ͻ� or");
			System.out.println("ġ������ ����ϴ� �ν��Ͻ�");
			System.out.println();
		}
		if(c2 instanceof StrawberryCheeseCake3) {  // c�� �����ϴ� Ŭ�����̹Ƿ� true
			System.out.println("����ġ�������ν��Ͻ� or");
			System.out.println("����ġ������ ����ϴ� �ν��Ͻ�");
			System.out.println();
		}

	}

}