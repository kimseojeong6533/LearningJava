package lambdaexpression;

/**
 
 �Լ��� �������̽� ���� : 
  - ���ٽ��� �����ϱ� ���� �������̽�.
  - �͸� �Լ��� �Ű����������� �����ǹǷ�, �������̽��� �� �ϳ��� �޼��常�� �����ؾ� ��.  -> @FunctionalInterface�� �̿��ؼ� ���ο� �������� �޼��带 �����ϸ� ������ ������ ó���� �� ����
 
 */


@FunctionalInterface
public interface MyNumber {
	
	int getMax(int num1, int num2);

}
