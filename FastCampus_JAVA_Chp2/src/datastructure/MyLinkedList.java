package datastructure;


public class MyLinkedList {
	private MyListNode head;   //��ũ�帮��Ʈ�� ���� ���� ����Ʈ�� ������, ��ũ�帮��Ʈ�� ù ��° ��带 ����Ű�� �뵵
	 											 
	int count;   // ����� ��
	
	public MyLinkedList() {
		head = null;    
		count = 0;
	}
	
	public MyListNode addElement(String data) {   // ������ ��忡 �߰��� ��带 ����
		MyListNode newNode;
		
		if(head==null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			
			//���� ������ ��� ã��
			MyListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {

		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position>=count) {
			System.out.println("Position Error");
			return null;
		}
		
		if(position==0) {  // ù��° ��ġ�� ���Ե� ���
			newNode.next = head;
			head = newNode;
		}
		else {
			for(int i=0;i<position;i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next; // �����Ϸ��� ����� ������ġ�� ��������� ����
			preNode.next = newNode;          // ��������� �������� �����Ϸ��� ��� 
		
		}
		count++;
		System.out.println("������ �Ϸ�!");
		return newNode;
		
	}
	
	public void removeElement(int position) {
		MyListNode temp = head;
		MyListNode preNode = null;
		
		if(position<0 || position>=count) {
			System.out.println("PositionError");
			return;
		}
		if(position==0) {
			head = temp.next;
			count--;
			System.out.printf("%d��ġ�� ��� ���� �Ϸ�",position);
			return;
		}
		for(int i=0;i<position;i++) {
			preNode = temp;
			temp = temp.next;
		}
		
		preNode.next = temp.next;
		count--;
		System.out.printf("%d��ġ�� ��� ���� �Ϸ�",position);
		return; 
		
	}
	public String getElement(int position) {
		MyListNode preNode = null;
		MyListNode temp = head;
		
		if(position<0 || position>count) {
			System.out.println("Position Error");
			return null;
		}
		if(position==0) {	
			return "�ش� �������� data : "+temp.data;
		}
		for(int i=0;i<position;i++) {
			temp = temp.next;
		}
		return "�ش� �������� data : "+temp.data;
	}
	
	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("�˻� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� �� ���

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	
	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}

}
