package first;

public class switchExam {

	public static void main(String[] args) {
		//switch문 구성요소 : switch, case, default, break
		int value = 5;
		
		switch(value) {
			case 1:
				System.out.println("1");  //case 1부터 시작해서, 만난 케이스문이 조건에 맞앗을 때, 이후 case문 모두 실행됨.
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default :  // default 구문은 생략가능함
				System.out.println("그외 다른숫자");
				break;
				
		}
		
		String str = "B";  //jdk7부터는 switch문 괄호안에 문자열타입 변수도 가능해짐.
		switch(str) {
		case "A":
			System.out.println("A");  //case 1부터 시작해서, 만난 케이스문이 조건에 맞앗을 때, 이후 case문 모두 실행됨.
			break;
		case "B":
			System.out.println("B");
			break;
		case "C":
			System.out.println("C");
			break;
		default :  // default 구문은 생략가능함
			System.out.println("그외 다른숫자");
			break;
			
	}

	}

}
