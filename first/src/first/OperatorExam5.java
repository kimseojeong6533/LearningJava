package first;

public class OperatorExam5 {

	public static void main(String[] args) {
		// 삼항연산자
		// ()안에 내용이 true라면, 50이 b1에 넣어주고 false라면, 40이 b1에 들어감
		
		int b1 = (5 > 4) ? 50 : 40;  
		System.out.println(b1);
		
		
		boolean b2 = (5 > 4) ? ((100<200) ? true : false) : false; 
		System.out.println(b2);
	}

}
