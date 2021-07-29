package useobject;

/**
 1. Equals() : 
	
	 equals(), == : ��ü �ν��Ͻ� �ּҰ�(�������� ��)�� ���Ͽ� true/false�� ��ȯ
	 ���� �� ���� �������� ���� �ʿ䰡 ���� ��, �����ǰ� �ʿ��ϴ� 
	  ex. �ν��Ͻ� student1�� �й� : 100, �ν��Ͻ� student2�� �й� : 100 -> student1�� student2�� ���������� �ٸ� �ּҰ��� ��������, �����δ� ���� �л��̱� ������, �й��� ���Ͽ� ���� �������� �ջ�/����� �ʿ䰡 �ִ�. 
 
 2. hashcode() : 
  	  *JVM�� ���޸� ���� ��� : hash table(with Ű�� ��, �������� ��)
	  index(������ġ) = hash(key(��ü����)) --> hascode() : ��ü�� ��ü����(�޸� �ּҰ�)�� �̿��� �ؽ��ڵ带 ����� ���� -> �ν��Ͻ�, ��ü���� �ٸ� ���� ������ ��. 
	  
	  
-equals()�� hashcode()�� ���� �������ؾ� �ϴ� ����
���� equals()�� hashcode() �� �ϳ��� ������ �ϸ� ��� �ɱ�? hashcode()�� ������ ���� ������ ���� �� ��ü�� 
�ؽð��� �ٸ� �� �ִ�. ���� HashTable���� �ش� ��ü�� ����� *��Ŷ�� ã�� �� ����. 
(*��Ŷ : ���� �ؽð��� ������ �Ǿ��� ��(�ؽ��浹), ���� �ؽð��� ���� ��ü�� ���Ͽ� ��Ŷ�̶�� ������ ��ũ�帮��Ʈ�� �ش簴ü���� �߰��ϰ� ��.

�ݴ�� equals()�� ���������� ������ hashcode()�� ���� �ؽð��� �̿��� ��ü�� ����� ��Ŷ�� ã�� ���� ������ 
�ش� ��ü�� �ڽŰ� ���� ��ü���� ���� ���� �� ���� ������ null�� �����ϰ� �ȴ�. ���� ���� ���ϴ� ��ü�� ã�� �� ����.
�̷��� ������ ��ü�� ��Ȯ�� ���� �񱳸� ���ؼ��� (Ư�� Hash ���� �÷��� �����ӿ�ũ�� ����Ҷ�!) 
Object�� equals() �޼ҵ常 ���������� ���� hashCode()�޼ҵ嵵 �������ؼ� ���� ���� ��ü�ϰ�� ������ �ؽ��ڵ尡 ���ϵǵ��� �ؾ��Ѵ�.
	   
 */

public class useEquals {

	public static void main(String[] args) {
		Student st1 = new Student(100, "Kim");    // st1�� st2�� ��� ���� ����̴� 
		Student st2 = new Student(100, "Kim");
		Student st3 = st1;
		System.out.println(st1==st2);              // false (�ٸ� �ν��Ͻ�  -> �ּҰ��� �ٸ�)
		System.out.println(st1.equals(st2));  //��������, false (�ٸ� �ν��Ͻ� -> �ּҰ��� �ٸ��� ����)
																		   //������(���� Ŭ�������� ���� �й��̸� ���� ���)��, true 
		System.out.println(st3==st1);              //true (�������� -> st3�� st1�� �ּҰ��� ����)
		
		System.out.println(st1.hashCode());  // ��������, �й��� ��ȯ��.
		System.out.println(st2.hashCode());  
		System.out.println(st3.hashCode());  
		
		String str1 = new String("abc");             //String�� ���, String��ü�� �ּҰ�
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode()); //100�� ���
		
		System.out.println(System.identityHashCode(st1));   // �� �ؽ��ڵ� �� ��ȯ -> st1�� st2�� �������� �ּҴ� �ٸ��ٴ� ��. 
		System.out.println(System.identityHashCode(st2));
		
	}

}
