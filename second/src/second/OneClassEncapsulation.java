package second;

class SinusCap{
	void sniTake() {
		System.out.println("콧물이 싹~ 납니다");
	}
	void sneTake() {
		System.out.println("재채기가 멎습니다");
	}
	void snuTake() {
		System.out.println("코가 뻥 뚫립니다");
	}
	
	void Take() {
		sniTake();
		sneTake();
		snuTake();
		System.out.println('\n');
	}
}

class ColdPatient{
	void takeSinus(SinusCap cap) {  // 클래스에서 다른 클래스를 input으로 사용 
		cap.Take();
	}
}


public class OneClassEncapsulation {

	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());   
		suf.takeSinus(new SinusCap());

	}

}
