package Array;

import java.util.ArrayList;  //ArrayList�� Ŀ���� ��� F1�� ������ reference document�� ��� ����
/**
 ArrayList : ��ü �迭�� ���� ȿ�������� �����ϱ� ���� �ڹٿ��� �������ִ� Ŭ���� 
                   -add/size/get/remove/isEmpty() ��
 */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); //��ü �迭 library ����
		
		library.add(new Book("�¹���1","������"));  //
		library.add(new Book("�¹���2","������"));  //
		library.add(new Book("�¹���3","������"));  //
		library.add(new Book("�¹���4","������"));  //
		library.add(new Book("�¹���5","������"));  //
		
		for(int i=0;i<library.size();i++) {  
			library.get(i).showInfo();;
		}
		

	}

}
