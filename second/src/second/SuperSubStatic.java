package second;

/**
 
 private : Only 클래스 내수에서만 접근가능 (외부 클래스에서 인스턴스 생성시, 참조하거나 수정x)
 protected : 상속관계의 클래스끼리 접근가능 
 default : 동일한 패키지의 클래스끼리 접근가능
 public : 모든 클래스에서 접근가능 
 
 */

class SuperCLS2{
	protected static int count = 0;  // 상속관계의 클래스에서 접근가능한 멤버변수 count
	protected int cnt = 0;
	public SuperCLS2() {    // 인스턴스 또는 클래스이름으로 접근하면 1이 증가됨.
		count++;
		cnt++;
	}
}

class SubCLS2 extends SuperCLS2{
	public SubCLS2(){
		super();
	}
	public void showCount() {
		System.out.println("count : "+count);
	}
}

public class SuperSubStatic {

	public static void main(String[] args) {
		SuperCLS2 obj1 = new SuperCLS2();
		System.out.println(obj1.cnt);  // cnt 나 count가 private이라면, 메인함수가 있는 클래스에서 접근 못함 	
		
		SuperCLS2 obj2 = new SuperCLS2();
		SubCLS2 obj3 = new SubCLS2();
		obj3.showCount();
	}

}
