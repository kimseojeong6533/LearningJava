package first;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";  // str1�� str2�� "hello"��� ���ڿ� ������ �����ϰ� ����. ��, �Ȱ��� ��ü�� �ΰ��� ������ ����Ű�� �ִ� ��. 
		
		String str3 = new String("hello");   
		String str4 = new String("hello"); // str3�� str4�� "hello"��� ���� ���� �ٸ� ��ü�� ����Ű�� ����
		
		if (str1 == str3) {
			System.out.println("str1�� str3�� ���� �ν��Ͻ��� �����մϴ�.");
		}
		else {
			System.out.println("str1�� str3�� �ٸ� �ν��Ͻ��� �����մϴ�.");   // String�� �Һ� Ŭ�����̴�. �Һ��̶� String�� �ν��Ͻ��� �ɶ� ������ �ִ� ���� ���߿� ������ �� ����.
		}
			
		System.out.println(str3);
		System.out.println(str1.substring(3)); 
		System.out.println(str1);
		
		

	}

}
