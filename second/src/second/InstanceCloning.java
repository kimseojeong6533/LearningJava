package second;

/**
 
 ObjŬ����(�ֻ��� Ŭ����)���� �ν��Ͻ� ���縦 ���� �޼ҵ尡 �̹� ���ǵǾ� ����.
 => protected Object clone() throws CloneNotSupportedException;  //���纻�� �������� ��ȯ��.
 
 interface Cloneable <- �� �������̽��� ������ Ŭ������ �ν��Ͻ��� clone �޼ҵ尡 ȣ�Ⱑ���ϴ�.
 
 
 */

class Point_clone implements Cloneable{  // �ν��Ͻ��� ���縦 ���� Cloneable�� �������̽��� ����
	private int xPos;
	private int yPos;
	
	public Point_clone(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{  // clone�޼ҵ� 
		return super.clone();
	}
}

class Rectangle_clone implements Cloneable{
	private Point_clone upperLeft;
	private Point_clone lowerRight;
	
	public Rectangle_clone(int x1, int y1, int x2, int y2) {
		upperLeft = new Point_clone(x1,y1);
		lowerRight = new Point_clone(x2,y2);
	}
	
	public void showPosition() {
		
		upperLeft.showPosition();
		lowerRight.showPosition();
		System.out.println();
	}
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override   // ���� ���簡 �̷�������� clone�޼ҵ带 �������̵� 
	public Object clone() throws CloneNotSupportedException {
		Rectangle_clone copy = (Rectangle_clone)super.clone();  // Rectangle�̶�� �ν��Ͻ� Ʋ�� ���� ����
		copy.upperLeft = (Point_clone)upperLeft.clone();   // Rectangle�� upperLeft �� ���ؼ� ���� ���� ó��
		copy.lowerRight = (Point_clone)lowerRight.clone();
		return copy;
	}
	
}

public class InstanceCloning {

	public static void main(String[] args) {
		
		Point_clone p1 = new Point_clone(1,2);
		System.out.print("p1 ��ǥ������ : ");
		p1.showPosition();
		
		Point_clone p2;
		
		try {
			p2 = (Point_clone) p1.clone();
			p1.changePos(3, 4);
			
			System.out.print("p1 ��ǥ������ : ");
			p1.showPosition();
			
			System.out.print("������ p2 ��ǥ : ");
			p2.showPosition();
			
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Rectangle clone : ");
		Rectangle_clone r1 = new Rectangle_clone(1,2,3,4);
		Rectangle_clone r2;
		
		try {			
			
			
			r2 = (Rectangle_clone) r1.clone();
			System.out.print("r1 ��ǥ���� �� : ");
			r1.showPosition();
			r1.changePos(3,4,5,6);
			System.out.print("r1 ��ǥ���� �� : ");
			r1.showPosition();
			System.out.print("������ r2 ��ǥ : ");
			r2.showPosition();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();		
		}
		

	}
}
