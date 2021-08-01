package datastructure;


public class MyLinkedList {
	private MyListNode head;   //링크드리스트의 단일 연결 리스트의 기준점, 링크드리스트의 첫 번째 노드를 가리키는 용도
	 											 
	int count;   // 노드의 수
	
	public MyLinkedList() {
		head = null;    
		count = 0;
	}
	
	public MyListNode addElement(String data) {   // 마지막 노드에 추가로 노드를 연결
		MyListNode newNode;
		
		if(head==null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			
			//가장 마지막 노드 찾기
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
		
		if(position==0) {  // 첫번째 위치에 삽입될 경우
			newNode.next = head;
			head = newNode;
		}
		else {
			for(int i=0;i<position;i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next; // 삽입하려는 노드의 다음위치는 이전노드의 다음
			preNode.next = newNode;          // 이전노드의 다음노드는 삽입하려는 노드 
		
		}
		count++;
		System.out.println("노드삽입 완료!");
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
			System.out.printf("%d위치의 노드 삭제 완료",position);
			return;
		}
		for(int i=0;i<position;i++) {
			preNode = temp;
			temp = temp.next;
		}
		
		preNode.next = temp.next;
		count--;
		System.out.printf("%d위치의 노드 삭제 완료",position);
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
			return "해당 포지션의 data : "+temp.data;
		}
		for(int i=0;i<position;i++) {
			temp = temp.next;
		}
		return "해당 포지션의 data : "+temp.data;
	}
	
	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

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
			System.out.println("출력할 내용이 없습니다.");
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
