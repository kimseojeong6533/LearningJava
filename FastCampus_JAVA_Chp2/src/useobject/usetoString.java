package useobject;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {  //Object클래스의 toString메소드를 재정의 
		return title+", "+author;
	}
}

public class usetoString {

	public static void main(String[] args) {
		Book book = new Book("데미안","헤르만헤세");
		
		// System.out.println(book);  // <- 재정의 이전에는 16진수로 된 JVM에 의해 만들어진 인스턴스의 가상 메모리 주소
		System.out.println(book);   // <- toString()을 재정의하여 title과 author가 출력됨. 즉, println(obj)를 했을 때,obj의 toString()값이 리턴된다는 뜻.
		
		
		String str = new String("test");
		System.out.println(str.toString());
		

	}

}
