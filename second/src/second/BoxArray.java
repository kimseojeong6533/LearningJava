package second;

public class BoxArray {

	public static void main(String[] args) {
		String[] ar = new String[7];
		ar[0] = "Java";
		ar[1] = "System";
		ar[2] = "Compiler";
		ar[3] = "Park";
		ar[4] = "Tree";
		ar[5] = "Dinner";
		ar[6] = "Brunch Cafe";
		int sum_length = 0;
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			sum_length += ar[i].length();
		}
		System.out.println(sum_length);

	}

}
