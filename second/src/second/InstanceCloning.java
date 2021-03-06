package second;

/**
 
 Obj클래스(최상위 클래스)에는 인스턴스 복사를 위한 메소드가 이미 정의되어 있음.
 => protected Object clone() throws CloneNotSupportedException;  //복사본의 참조값이 반환됨.
 
 interface Cloneable <- 이 인터페이스를 구현한 클래스의 인스턴스만 clone 메소드가 호출가능하다.
 
 
 */

class Point_clone implements Cloneable{  // 인스턴스를 복사를 위해 Cloneable를 인터페이스를 구현
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
	public Object clone() throws CloneNotSupportedException{  // clone메소드 
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
	
	@Override   // 깊은 복사가 이루어지도록 clone메소드를 오버라이딩 
	public Object clone() throws CloneNotSupportedException {
		Rectangle_clone copy = (Rectangle_clone)super.clone();  // Rectangle이라는 인스턴스 틀에 대한 복사
		copy.upperLeft = (Point_clone)upperLeft.clone();   // Rectangle의 upperLeft 에 대해서 따로 복사 처리
		copy.lowerRight = (Point_clone)lowerRight.clone();
		return copy;
	}
	
}

public class InstanceCloning {

	public static void main(String[] args) {
		
		Point_clone p1 = new Point_clone(1,2);
		System.out.print("p1 좌표변경전 : ");
		p1.showPosition();
		
		Point_clone p2;
		
		try {
			p2 = (Point_clone) p1.clone();
			p1.changePos(3, 4);
			
			System.out.print("p1 좌표변경후 : ");
			p1.showPosition();
			
			System.out.print("복사한 p2 좌표 : ");
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
			System.out.print("r1 좌표변경 전 : ");
			r1.showPosition();
			r1.changePos(3,4,5,6);
			System.out.print("r1 좌표변경 후 : ");
			r1.showPosition();
			System.out.print("복사한 r2 좌표 : ");
			r2.showPosition();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();		
		}
		

	}
}
