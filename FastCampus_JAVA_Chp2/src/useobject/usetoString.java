package useobject;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {  //ObjectŬ������ toString�޼ҵ带 ������ 
		return title+", "+author;
	}
}

public class usetoString {

	public static void main(String[] args) {
		Book book = new Book("���̾�","�츣���켼");
		
		// System.out.println(book);  // <- ������ �������� 16������ �� JVM�� ���� ������� �ν��Ͻ��� ���� �޸� �ּ�
		System.out.println(book);   // <- toString()�� �������Ͽ� title�� author�� ��µ�. ��, println(obj)�� ���� ��,obj�� toString()���� ���ϵȴٴ� ��.
		
		
		String str = new String("test");
		System.out.println(str.toString());
		

	}

}
