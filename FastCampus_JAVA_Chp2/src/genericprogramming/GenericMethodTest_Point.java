package genericprogramming;

/**
 ���׸� �޼��� : 
 - �ڷ��� �Ű������� �޼����� �Ű������� ��ȯ������ ������ �޼���� �ڷ��� �Ű������� �ϳ��̻��� ��찡 ���� -> ���׸� �޼��� ���
 - ���׸� Ŭ������ �ƴ϶�, ���ο� ���׸� �޼��带 �����Ͽ� ��밡��
 ex.  public <�ڷ��� �Ű�����> ��ȯ�� �޼����̸�(�ڷ��� �Ű�����1, ..) {} 
 */

public class GenericMethodTest_Point {

	// int��, double�� �Ű������� ��Ʈ�� �� ��(point)�� �������� �簢��(Rectangle)�� �����, �簢���� ���̸� ���ϴ� �޼��� �����
	
	public static <T,V> double makeRectangle(Point <T,V> p1, Point <T,V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double bottom = ((Number)p1.getY()).doubleValue();
		double top = ((Number)p2.getY()).doubleValue();
		
		double width = Math.abs(right-left);
		double height = Math.abs(top-bottom);
		
		return width*height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);
		Point<Integer, Double> p2 = new Point<>(8,3.8);
		
		double rect = GenericMethodTest_Point.<Integer, Double> makeRectangle(p1, p2);
		System.out.printf("�簢���� ���� : %f\n",rect);  // double�� ������� : %f 
		
	}
}
