package first;

public class switchExam {

	public static void main(String[] args) {
		//switch�� ������� : switch, case, default, break
		int value = 5;
		
		switch(value) {
			case 1:
				System.out.println("1");  //case 1���� �����ؼ�, ���� ���̽����� ���ǿ� �¾��� ��, ���� case�� ��� �����.
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default :  // default ������ ����������
				System.out.println("�׿� �ٸ�����");
				break;
				
		}
		
		String str = "B";  //jdk7���ʹ� switch�� ��ȣ�ȿ� ���ڿ�Ÿ�� ������ ��������.
		switch(str) {
		case "A":
			System.out.println("A");  //case 1���� �����ؼ�, ���� ���̽����� ���ǿ� �¾��� ��, ���� case�� ��� �����.
			break;
		case "B":
			System.out.println("B");
			break;
		case "C":
			System.out.println("C");
			break;
		default :  // default ������ ����������
			System.out.println("�׿� �ٸ�����");
			break;
			
	}

	}

}
