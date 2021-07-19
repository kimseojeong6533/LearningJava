package first;

public class OperatorExam4 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); //논리곱 : 모두 true -> true
		System.out.println(b1 || b2); //논리합 : 피연산자중 하나만 true -> true
		System.out.println(b1 ^ b2);  //배타적 논리합 : 피연산자가 서로 다른 값 -> true
		System.out.println(!b1);      //논리 부정 : 피연산자의 논리값 반대(true -> false, false -> true)
		
	}

}
