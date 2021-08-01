package datastructure;

/**
 Queue(ť) :
 - Fist In First Out (���Լ���) ����
 - �� ��(front) ���� �ڷḦ �����ų� �����ϰ�, �� ��(rear)���� �ڷḦ �߰� ��
*ArrayList�� ť��������
 */

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyQueue extends MyLinkedList implements Queue{

	MyListNode front;   // �Ǿ�
	MyListNode rear;    // �ǵ�
	
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
