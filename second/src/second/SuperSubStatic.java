package second;

/**
 
 private : Only Ŭ���� ���������� ���ٰ��� (�ܺ� Ŭ�������� �ν��Ͻ� ������, �����ϰų� ����x)
 protected : ��Ӱ����� Ŭ�������� ���ٰ��� 
 default : ������ ��Ű���� Ŭ�������� ���ٰ���
 public : ��� Ŭ�������� ���ٰ��� 
 
 */

class SuperCLS2{
	protected static int count = 0;  // ��Ӱ����� Ŭ�������� ���ٰ����� ������� count
	protected int cnt = 0;
	public SuperCLS2() {    // �ν��Ͻ� �Ǵ� Ŭ�����̸����� �����ϸ� 1�� ������.
		count++;
		cnt++;
	}
}

class SubCLS2 extends SuperCLS2{
	public SubCLS2(){
		super();
	}
	public void showCount() {
		System.out.println("count : "+count);
	}
}

public class SuperSubStatic {

	public static void main(String[] args) {
		SuperCLS2 obj1 = new SuperCLS2();
		System.out.println(obj1.cnt);  // cnt �� count�� private�̶��, �����Լ��� �ִ� Ŭ�������� ���� ���� 	
		
		SuperCLS2 obj2 = new SuperCLS2();
		SubCLS2 obj3 = new SubCLS2();
		obj3.showCount();
	}

}