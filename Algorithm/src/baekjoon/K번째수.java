package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class K번째수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();  // 입력한 한 라인을 문자열형으로 입력받아 str1에 초기화 
		String[] arrstr = str1.split(" ");   // String을 String형 배열로 바꾸어 준다
		int[] num1 = Arrays.asList(arrstr).stream().mapToInt(Integer::parseInt).toArray();  // String형 배열 -> Int형 배열
		int N = num1[0];
		int K = num1[1];
		
	
		String str2 = sc.nextLine();       //입력한 한라인을 입력받아 str2에 초기화
		String[] arrstr2 = str2.split(" "); // String을 String형 배열로 바꾸어준다
		int[] num = Arrays.asList(arrstr2).stream().mapToInt(Integer::parseInt).toArray(); // String형 배열 -> Int형 배열
		
		Arrays.sort(num);
		System.out.println(num[K-1]);
		
	}

}
