package second;

class Point{
	
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public boolean equals(Point ex1) {
		if (xPos==ex1.xPos && yPos==ex1.yPos) 
			return true;
		else
			return false;
		
	}
}

class Rectangle{
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1,y1);
		lowerRight = new Point(x2,y2); 
		
	}
	
	public boolean equals(Rectangle p1) {
		if (upperLeft.equals(p1.upperLeft) && lowerRight.equals(p1.lowerRight)) {
			return true;
		}
		else
			return false;
	}
}


public class P428_19_1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1,2,3,4);
		
		Rectangle r2 = new Rectangle(1,2,3,3);
		Rectangle r3 = new Rectangle(1,2,3,4);
		
		
		if (r1.equals(r2)) {
			System.out.println("r1과 r2는 내용이 같습니다");
		}
		else {
			System.out.println("r1과 r2는 내용이 다릅니다");
		}
		
		if (r1.equals(r3)) {
			System.out.println("r1과 r3는 내용이 같습니다");
		}
		else {
			System.out.println("r1과 r3는 내용이 다릅니다");
		}
		
		
		

	}

}
