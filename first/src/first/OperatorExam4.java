package first;

public class OperatorExam4 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); //���� : ��� true -> true
		System.out.println(b1 || b2); //���� : �ǿ������� �ϳ��� true -> true
		System.out.println(b1 ^ b2);  //��Ÿ�� ���� : �ǿ����ڰ� ���� �ٸ� �� -> true
		System.out.println(!b1);      //�� ���� : �ǿ������� ���� �ݴ�(true -> false, false -> true)
		
	}

}
