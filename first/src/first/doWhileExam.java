package first;
import java.util.Scanner;

public class doWhileExam {

	public static void main(String[] args) {
		
		int value = 0;
		
		Scanner scan = new Scanner(System.in); //Scanner는 java.util패키지에 있는 클래스, 키보드로부터 값을 입력받는 등 사용됨.
		do {
			//우선 반복,
			value = scan.nextInt();
			System.out.println("입력받은 값 : " + value);
		}while(value != 10);
		
		System.out.println("반복문 종료!");
	}

}
