package first;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 5000;
		long y = x;    // ũ�Ⱑ �� ���� Ÿ����(int)�� ������ �� ūŸ��(long)���� �ٲ� ������ ���������� ����ȯ�� �Ͼ.
		System.out.println(y);
		
		long x2 = 5;
		// int y2 = x2;   �̷��� �ϸ� �����Ϸ��� ������ �߻� ��Ŵ.
		int y2 = (int)x2;  // ũ�Ⱑ �� ū Ÿ������ ������ �� ���� Ÿ������ �ٲܶ����� ���������(int) ����ȯ�� �����־�� ��.
		System.out.println(y2);
		

	}

}
