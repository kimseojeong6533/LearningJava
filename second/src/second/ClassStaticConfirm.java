package second;

class InstCnt{
	static int instNum=0;    // 클래스 변수(static)
	InstCnt(){    // 생성자
		instNum++;
		System.out.println("인스턴스 생성 : "+instNum);
		
	}
}



public class ClassStaticConfirm {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();     // 인스턴스가 생성될때마다 instNum이 초기화가 되지 않고 계속 증가하게됨(static특성)
													// static 변수 : 클래스변수(인스턴스 변수x) 즉, 인스턴스 생성과 관계없이 존재하는 변수임. 모든 인스턴스가 공유하는 변수.
		
		

	}

}
