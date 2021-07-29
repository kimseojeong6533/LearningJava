package Array;

import java.util.Arrays;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���2","������");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		System.arraycopy(library, 0, copyLibrary, 0, library.length);   // �迭 (����)���縦 ���� �Լ� : arraycopy, Arrays.copyof ����� ����.
		
		
		for(Book e :library) {
			System.out.println(e);
			e.showInfo();
			
		}
		System.out.println();
		for(Book e :copyLibrary) {
			System.out.println(e);   // library�� copyLibrary�� �ּҰ��� ���� (��������) -> copy�� ��ü������ �ٲٸ� ���� ��ü�� ���뵵 �ٲ�� ��.
			e.showInfo();
		}
		
		
		// ���� ���縦 �Ϸ���
		
		System.out.println("-------------------------------------��������-------------------------------------");
		Book[] copyLibrary2 = new Book[library.length];
		
		for(int i=0;i<library.length;i++) {
			copyLibrary2[i] = new Book();     // �迭 �� �ε������� Ŭ�������� �������� 
			copyLibrary2[i].setAuthor(library[i].getAuthor());
			copyLibrary2[i].setTitle(library[i].getTitle());
		}
		
		for(Book e :library) {
			System.out.println(e);
			e.showInfo();
			
		}
		System.out.println();
		for(Book e :copyLibrary2) {
			System.out.println(e);   // library�� copyLibrary�� �ּҰ��� �ٸ� (��������)
			e.showInfo();
		}
		
		
		
		
	}
	
	
	
	

}
