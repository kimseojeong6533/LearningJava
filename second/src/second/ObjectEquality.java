package second;


/**
 == 연산자 : 참조변수의 참조값을 비교 -> 두 인스턴스의 내용을 비교하려면 equals이라는 메소드를 오버라이딩하여 사용
 */

class Inum{
	private int num;
	public Inum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num==((Inum)obj).num)
			return true;
		else
			return false;
	}
}

public class ObjectEquality {

	public static void main(String[] args) {
		Inum num1 = new Inum(3);
		Inum num2 = new Inum(3);
		Inum num3 = new Inum(4);
		
		if (num1.equals(num2)){
			System.out.println("num1과 num2의 인스턴스 내용이 같습니다.");
		}
		else {
			System.out.println("num1과 num2의 인스턴스 내용이 다릅니다.");
		}
		System.out.println();
		
		if (num1.equals(num3)){
			System.out.println("num1과 num3의 인스턴스 내용이 같습니다.");
		}
		else {
			System.out.println("num1과 num3의 인스턴스 내용이 다릅니다.");
		}
		
			

	}

}
