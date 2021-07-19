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
        System.out.println("r = 2.2, ���� ���� :  "+sc.calCircleArea(2.2));
        System.out.println("������ 5.1, ���� �ѷ� : "+sc.calCirclelPeri(5.1));
        System.out.println("Ŭ���� - static���� ����, ������ 4.4, ���� ���� : "+SimpleCalculator.calCircleArea(4.4));

	}

}
