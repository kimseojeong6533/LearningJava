package genericprogramming;

public class Point<T,V> {   // T parameter : <T,V> 선언
	T x;  // int형이 들어갈 예정
	V y;  // double형이 들어갈 예정
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	

}
