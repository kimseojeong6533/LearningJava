package interface_inheritance;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();   // �����ڰ� ȣ��Ǿ��� ��, �ν��Ͻ��� �����ǵ��� �ڵ带 ¥�� ���� ����. 
		System.out.println("ShelfŬ������ ������ ȣ���");
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
