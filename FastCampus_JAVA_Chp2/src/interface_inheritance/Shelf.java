package interface_inheritance;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();   // 생성자가 호출되었을 때, 인스턴스가 생성되도록 코드를 짜는 것이 좋다. 
		System.out.println("Shelf클래스의 생성자 호출됨");
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
