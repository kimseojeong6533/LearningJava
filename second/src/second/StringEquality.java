package second;

public class StringEquality {

	public static void main(String[] args) {
		
		String str1 = new String("Simple");
		String str2 = new String("Simple");
		String str3 = "Dimple";
		String str4 = "Simple";
		
		
		if(str1 == str2) {
			System.out.println("��������� ����");
		}
		
		if(str3 == str4) {
			System.out.println("��������� �����մϴ�");
		}
		else
			System.out.println("��������� �ٸ��ϴ�");
		
		if(str1 == str4) {
			System.out.println("��������� �����մϴ�");
		}
		else
			System.out.println("��������� �ٸ��ϴ�");

	}

}