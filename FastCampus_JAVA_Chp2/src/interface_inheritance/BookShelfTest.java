package interface_inheritance;

import java.util.ArrayList;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookshelf = new BookShelf();  // BookShelf 생성자 -> super -> Shelf 생성자 => String형의 ArrayList 인스턴스가 생성되고 그것이 bookshelf참조변수가 가르키게 됨.
		                                                                    // 단, bookshelf참조변수는 Queue 인터페이스형이므로, Queue에 존재하는 메소드명만 접근가능한데, 해당 메소드들을 사용하면, 
		                                                                    //  Queue 인터페이스를 구현한 BookShelf클래스에서 재정의된 함수가 호출됨.  
		
		bookshelf.enQueue("토지1");
		bookshelf.enQueue("토지2");
		bookshelf.enQueue("토지3");
		bookshelf.enQueue("토지4");
		bookshelf.enQueue("토지5");
		
		System.out.println(bookshelf.getSize());
		System.out.println(bookshelf.deQueue());   // FIFO (먼저 들어간 놈이 먼저 나옴) 
		System.out.println(bookshelf.deQueue());   // FIFO (먼저 들어간 놈이 먼저 나옴)
		System.out.println(bookshelf.deQueue());   // FIFO (먼저 들어간 놈이 먼저 나옴)
		System.out.println(bookshelf.deQueue());   // FIFO (먼저 들어간 놈이 먼저 나옴)
		System.out.println(bookshelf.deQueue());   // FIFO (먼저 들어간 놈이 먼저 나옴)
		

	}

}
