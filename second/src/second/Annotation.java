package second;


/**
 @Override �� ��� : �������̵��� �޼ҵ带 �����Ͽ��� �˷��ִ� ����. 
                                    ����� �������̵��� ���� �ʾҴٸ�, �����ϴܰ迡�� �����޽����� ���.
 */
class ParentAdder{
	public int add(int a, int b) {
		System.out.println("Parent add : ");
		return a+b;
	}
}

class ChildAdder extends ParentAdder{
	@Override   
	public int add(int a, int b) {  // �������̵� 
		System.out.println("childadd : ");
		return a+b;
	}
}

public class Annotation {

	public static void main(String[] args) {
		//ParentAdder p = new ParentAdder();
		ParentAdder c = new ChildAdder();
		
		System.out.println(c.add(4, 5));
		

	}

}
