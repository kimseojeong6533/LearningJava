package second;
import java.util.Scanner;

public class ScanningString {

	public static void main(String[] args) {
		
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt();  // int형 데이터 추출
		
		int num2 = sc.nextInt();
		
		int num3 = sc.nextInt();
		
		
		int sum = num1+num2+num3;
		
		System.out.printf("%d + %d + %d = %d  \n", num1,num2,num3,sum);
		
		// System.in : 키보드로 입력받기

		Scanner sc2 = new Scanner(System.in);
		int num4 = sc2.nextInt();  // int형 데이터 추출
		int num5 = sc2.nextInt();
		int num6 = sc2.nextInt();
		
		int sum2 = num4+num5+num6;
		
		System.out.printf("%d + %d + %d = %d  \n", num4,num5,num6,sum2);
		
		
		// 문자열 입력 - nextLine()
		Scanner sc3 = new Scanner(System.in);
		String str1 = sc3.nextLine();
		System.out.printf("%s  \n",str1);
	}

}
