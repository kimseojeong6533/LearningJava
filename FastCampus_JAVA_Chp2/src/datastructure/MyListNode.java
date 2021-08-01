package datastructure;

public class MyListNode {
	public String data;
	public MyListNode next;    
	
	public MyListNode() {
		this.data = null;
		this.next = null;
	}
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}

	public String getData() {
		return data;
	}
	
}
