package first;

public class WhileExam {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<10) {
			System.out.println("i의 값은 "+i+"입니다.");
			i++;
		}
		System.out.println("\n");
		
		int total = 0;
		int j = 1;
		while(j<=100) {
			total+=j;
			j++;
		}
		System.out.println(total);

	}

}
