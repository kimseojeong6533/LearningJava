package second;

class InstCnt{
	static int instNum=0;    // Ŭ���� ����(static)
	InstCnt(){    // ������
		instNum++;
		System.out.println("�ν��Ͻ� ���� : "+instNum);
		
	}
}



public class ClassStaticConfirm {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();     // �ν��Ͻ��� �����ɶ����� instNum�� �ʱ�ȭ�� ���� �ʰ� ��� �����ϰԵ�(staticƯ��)
													// static ���� : Ŭ��������(�ν��Ͻ� ����x) ��, �ν��Ͻ� ������ ������� �����ϴ� ������. ��� �ν��Ͻ��� �����ϴ� ����.
		
		

	}

}
