package oopversuslambda;




public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hi~!";
		String s2 = "Bye~!";
		
		//���� Ŭ������ ���� String concat
		StringConcatImplement sc1 = new StringConcatImplement();
		sc1.makeString(s1, s2);
		
		//lambda���� �̿��� String concat
		// �����δ� Ŭ������������  �ϴ� ���� �ƴ�. 
		// �͸�Ŭ������ ��������� ����ϴ� ��.
		// ����, makeString�̿� �ٸ� �޼��带 StringConcat�������̽��� �� �� ����.
		StringConcat concat = (s,v) -> System.out.println(s+v);  // �������̽� ����
		concat.makeString(s1, s2);  
		

	}

}
