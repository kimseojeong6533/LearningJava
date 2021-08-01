package genericprogramming;

/**
 제네릭 메서드 : 
 - 자료형 매개변수를 메서드의 매개변수나 반환값으로 가지는 메서드는 자료형 매개변수가 하나이상인 경우가 있음 -> 제네릭 메서드 사용
 - 제네릭 클래스뿐 아니라, 내부에 제네릭 메서드를 구현하여 사용가능
 ex.  public <자료형 매개변수> 반환형 메서드이름(자료형 매개변수1, ..) {} 
 */

public class GenericMethodTest_Point {

	// int형, double형 매개변수가 세트인 두 점(point)를 기준으로 사각형(Rectangle)을 만들고, 사각형의 넓이를 구하는 메서드 만들기
	
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
		System.out.printf("사각형의 넓이 : %f\n",rect);  // double형 출력형식 : %f 
		
	}
}
