package genericprogramming;

public class Point<T,V> {   // T parameter : <T,V> ����
	T x;  // int���� �� ����
	V y;  // double���� �� ����
	
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
