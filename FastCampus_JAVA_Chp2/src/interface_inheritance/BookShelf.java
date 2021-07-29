package interface_inheritance;

/**
 Shelf(Class)      Queue(Interface)
                          бщ
                    BookShelf(Class)
                          
 */

public class BookShelf extends Shelf implements Queue{

	public BookShelf() {
		super();
	}
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return shelf.size();
	}

}
