package second;

class Circle3 {  // 같은 패키지안에 같은 이름의 class가 있으면 안됨. 
	static final double PI = 3.1415;
	static double radius=0;
	
	Circle3(double rad){
		radius = rad;
	}
	
	void showPerimeter() {
		double peri = (radius * 2)*PI;
		System.out.println("둘레 : "+peri);
	}
	void showArea() {
		double area = (radius*radius)*PI;
		System.out.println("넓이 : "+area);
	}
}

public class CircleConstPI {

	public static void main(String[] args) {
		Circle3 c = new Circle3(1.5);
		
		c.showPerimeter();
		c.showArea();
	   
	}

}
