package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class K��°�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();  // �Է��� �� ������ ���ڿ������� �Է¹޾� str1�� �ʱ�ȭ 
		String[] arrstr = str1.split(" ");   // String�� String�� �迭�� �ٲپ� �ش�
		int[] num1 = Arrays.asList(arrstr).stream().mapToInt(Integer::parseInt).toArray();  // String�� �迭 -> Int�� �迭
		int N = num1[0];
		int K = num1[1];
		
	
		String str2 = sc.nextLine();       //�Է��� �Ѷ����� �Է¹޾� str2�� �ʱ�ȭ
		String[] arrstr2 = str2.split(" "); // String�� String�� �迭�� �ٲپ��ش�
		int[] num = Arrays.asList(arrstr2).stream().mapToInt(Integer::parseInt).toArray(); // String�� �迭 -> Int�� �迭
		
		Arrays.sort(num);
		System.out.println(num[K-1]);
		
	}

}
