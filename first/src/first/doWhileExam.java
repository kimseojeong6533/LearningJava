package first;
import java.util.Scanner;

public class doWhileExam {

	public static void main(String[] args) {
		
		int value = 0;
		
		Scanner scan = new Scanner(System.in); //Scanner�� java.util��Ű���� �ִ� Ŭ����, Ű����κ��� ���� �Է¹޴� �� ����.
		do {
			//�켱 �ݺ�,
			value = scan.nextInt();
			System.out.println("�Է¹��� �� : " + value);
		}while(value != 10);
		
		System.out.println("�ݺ��� ����!");
	}

}
