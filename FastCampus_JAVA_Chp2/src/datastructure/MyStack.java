package datastructure;

/**
 Stack : 
 - Last In First Out ( 후입선출 ) 구조
 - 맨 마지막 위치(top)에서만 자료를 추가,삭제, 꺼내올 수 있음 ( 중간의 자료를 꺼낼 수 없음)
 
 */
//이전에 구현했던 MyArray클래스를 이용해 Stack 구현
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
	
	public int pop() {   // top에 위치한 데이터를 반환
		if(top==0) {
			System.out.println("STACK IS EMPTY");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);  //(top-1)에 위치한 데이터를 반환하고 top = top-1처리
		
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
