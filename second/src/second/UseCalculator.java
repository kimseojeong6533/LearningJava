package second;

class SimpleCalculator{
	static final double PI = 3.1415;
	static double add(double n1, double n2) {
		return n1+n2;
	}
	
	static double min(double n1, double n2) {
		return n1 - n2;
	}
	
	static double calCircleArea(double r) {
		return r*r*PI;
	}
	
	static double calCirclelPeri(double r) {
		return PI*r*2;
	}
	
}

public class UseCalculator {

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
        System.out.println("3 + 4 = "+sc.add(3, 4));
        System.out.println("r = 2.2, 원의 넓이 :  "+sc.calCircleArea(2.2));
        System.out.println("반지름 5.1, 원의 둘레 : "+sc.calCirclelPeri(5.1));
        System.out.println("클래스 - static으로 접근, 반지름 4.4, 원의 넓이 : "+SimpleCalculator.calCircleArea(4.4));

	}

}
