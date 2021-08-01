package datastructure;

/**
 Queue(큐) :
 - Fist In First Out (선입선출) 구조
 - 맨 앞(front) 에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가 함
*ArrayList로 큐구현가능
 */

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyQueue extends MyLinkedList implements Queue{

	MyListNode front;   // 맨앞
	MyListNode rear;    // 맨뒤
	
	public MyQueue() {
		front = null;
		rear = null;
	}
	
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		else {
			String data = front.getData();
			front = front.next;
			if(front==null) {
				rear = null;
			}
			return data;
		}
	}

	@Override
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		else {
			MyListNode temp = front;
			while(temp != null) {
				System.out.print(temp.getData());
				temp = temp.next;
			}
			System.out.println();
			
		}
		
	}
	
}
