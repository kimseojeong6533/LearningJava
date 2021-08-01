package datastructure;

/**
 Stack : 
 - Last In First Out ( ���Լ��� ) ����
 - �� ������ ��ġ(top)������ �ڷḦ �߰�,����, ������ �� ���� ( �߰��� �ڷḦ ���� �� ����)
 
 */
//������ �����ߴ� MyArrayŬ������ �̿��� Stack ����
public class MyStack {

	int top;
	MyArray arrayStack;
	public MyStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyStack(int size) {
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("STACK IS FULL");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {   // top�� ��ġ�� �����͸� ��ȯ
		if(top==0) {
			System.out.println("STACK IS EMPTY");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);  //(top-1)�� ��ġ�� �����͸� ��ȯ�ϰ� top = top-1ó��
		
	}
	
	public boolean isFull() {
		if(top==arrayStack.ARRAY_SIZE) {
			return true;
		}
		else
			return false;
	}
	
	
	public int getSize() {
		return top;
	}
	
	public void printAll() {
		for(int i=top-1;i>=0;i--) {
			System.out.printf("%d ",arrayStack.getElement(i));
		}
		System.out.println();
	}
	
}
