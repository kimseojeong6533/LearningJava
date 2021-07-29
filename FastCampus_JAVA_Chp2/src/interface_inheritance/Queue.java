package interface_inheritance;

public interface Queue {
	void enQueue(String title);  // 책을 넣음
	String deQueue();  // 책이름을 꺼냄,반환
	int getSize();
	
}
