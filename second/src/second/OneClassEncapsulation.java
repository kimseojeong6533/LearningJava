package second;

class SinusCap{
	void sniTake() {
		System.out.println("�๰�� ��~ ���ϴ�");
	}
	void sneTake() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�");
	}
	void snuTake() {
		System.out.println("�ڰ� �� �ո��ϴ�");
	}
	
	void Take() {
		sniTake();
		sneTake();
		snuTake();
		System.out.println('\n');
	}
}

class ColdPatient{
	void takeSinus(SinusCap cap) {  // Ŭ�������� �ٸ� Ŭ������ input���� ��� 
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
