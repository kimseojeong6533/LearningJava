package Array;

import java.util.ArrayList;  //ArrayList에 커서를 대고 F1을 누르면 reference document로 기능 참고
/**
 ArrayList : 객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해주는 클래스 
                   -add/size/get/remove/isEmpty() 등
 */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); //객체 배열 library 선언
		
		library.add(new Book("태백산맥1","조정래"));  //
		library.add(new Book("태백산맥2","김정래"));  //
		library.add(new Book("태백산맥3","신정래"));  //
		library.add(new Book("태백산맥4","박정래"));  //
		library.add(new Book("태백산맥5","이정래"));  //
		
		for(int i=0;i<library.size();i++) {  
			library.get(i).showInfo();;
		}
		

	}

}
