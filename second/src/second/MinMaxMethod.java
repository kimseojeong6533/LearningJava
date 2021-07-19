package second;
import java.io.IOException;
import java.util.Scanner;

public class MinMaxMethod {
	
	public static int minValue(int[] array) {
		int value = array[0];
		for(int e:array) {
			if (e<value) 
				value = e;
		}
		return value;
	}
	
	public static int maxValue(int[] array) {
		int value = array[0];
		for(int e:array) {
			if (e>value) 
				value = e;
		}
		return value;
	}
	
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String [] str;
		str = s.split(" ");
		int [] arr = new int[str.length];
		for(int i=0;i<str.length;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int minval,maxval;
		minval = minValue(arr);
		maxval = maxValue(arr);
		
		
		for(int e : arr)
			System.out.print(e+" ");
		System.out.println("\nmin : "+minval);
		System.out.println("max : "+maxval);
		
		
	}
}
