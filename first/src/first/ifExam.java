package first;

public class ifExam {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 40;
		
		
		if(x<y) {   //java에서 조건문 : if/ else if/else 로 구성됨.
			System.out.println("x는 y보다 작습니다");
		}
		else if(x==y) {
			System.out.println("x는 y와 동일합니다");
		}
		else {
			System.out.println("x는 y보다 큽니다");
		}

	}

}
