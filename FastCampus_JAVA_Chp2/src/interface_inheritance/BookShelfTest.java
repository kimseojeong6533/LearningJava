package interface_inheritance;

import java.util.ArrayList;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookshelf = new BookShelf();  // BookShelf ������ -> super -> Shelf ������ => String���� ArrayList �ν��Ͻ��� �����ǰ� �װ��� bookshelf���������� ����Ű�� ��.
		                                                                    // ��, bookshelf���������� Queue �������̽����̹Ƿ�, Queue�� �����ϴ� �޼ҵ�� ���ٰ����ѵ�, �ش� �޼ҵ���� ����ϸ�, 
		                                                                    //  Queue �������̽��� ������ BookShelfŬ�������� �����ǵ� �Լ��� ȣ���.  
		
		bookshelf.enQueue("����1");
		bookshelf.enQueue("����2");
		bookshelf.enQueue("����3");
		bookshelf.enQueue("����4");
		bookshelf.enQueue("����5");
		
		System.out.println(bookshelf.getSize());
		System.out.println(bookshelf.deQueue());   // FIFO (���� �� ���� ���� ����) 
		System.out.println(bookshelf.deQueue());   // FIFO (���� �� ���� ���� ����)
		System.out.println(bookshelf.deQueue());   // FIFO (���� �� ���� ���� ����)
		System.out.println(bookshelf.deQueue());   // FIFO (���� �� ���� ���� ����)
		System.out.println(bookshelf.deQueue());   // FIFO (���� �� ���� ���� ����)
		

	}

}
