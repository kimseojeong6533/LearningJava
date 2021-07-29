package Array;

import java.util.Arrays;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","김정래");
		library[2] = new Book("태백산맥3","신정래");
		library[3] = new Book("태백산맥4","박정래");
		library[4] = new Book("태백산맥5","이정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, library.length);   // 배열 (얕은)복사를 위한 함수 : arraycopy, Arrays.copyof 등등이 있음.
		
		
		for(Book e :library) {
			System.out.println(e);
			e.showInfo();
			
		}
		System.out.println();
		for(Book e :copyLibrary) {
			System.out.println(e);   // library와 copyLibrary의 주소값이 같음 (얕은복사) -> copy한 객체내용을 바꾸면 원본 객체의 내용도 바뀌게 됨.
			e.showInfo();
		}
		
		
		// 깊은 복사를 하려면
		
		System.out.println("-------------------------------------깊은복사-------------------------------------");
		Book[] copyLibrary2 = new Book[library.length];
		
		for(int i=0;i<library.length;i++) {
			copyLibrary2[i] = new Book();     // 배열 각 인덱스마다 클래스형을 선언해줌 
			copyLibrary2[i].setAuthor(library[i].getAuthor());
			copyLibrary2[i].setTitle(library[i].getTitle());
		}
		
		for(Book e :library) {
			System.out.println(e);
			e.showInfo();
			
		}
		System.out.println();
		for(Book e :copyLibrary2) {
			System.out.println(e);   // library와 copyLibrary의 주소값이 다름 (깊은복사)
			e.showInfo();
		}
		
		
		
		
	}
	
	
	
	

}
