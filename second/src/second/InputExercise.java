package second;
import java.io.IOException;
import java.util.Scanner;
public class InputExercise {

	public static void main(String[] args) throws IOException{
		/* https://limkydev.tistory.com/170 (java 입출력 참고)*/
		
		
//		// int형 입력받기
//		System.out.print("int형 입력받기  : ");
//		Scanner sc = new Scanner(System.in);
//		int a,b;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a+" "+b);
		
		// char형 입력받기
//		char ch;
//		System.out.print("char형 입력받기  : ");
//		ch = (char)System.in.read();
//		System.out.println(ch);
//		System.out.println();
		
		// char형 여러개 입력받기
//		char c,d;
//		System.out.print("char형 여러개 입력받기  : ");
//		Scanner sc2 = new Scanner(System.in);
//		String str = sc2.nextLine();
//		c = str.charAt(0);
//		d = str.charAt(2);
//		System.out.println(c+" "+d);
//		System.out.println();
		
		//공백이 포함된 문자열 입력
		Scanner sc3 = new Scanner(System.in);
		String str = sc3.nextLine();
		String [] sarr;
		sarr = str.split(" ");
		for(int i=0;i<sarr.length;i++) {
			System.out.println(sarr[i]);
		}
		
		
		
		
		
		
		
		
		

	}

}
