package csscheduler;

/**
 ���� �ְų� �������� �Ҵ�� ��ȭ ���� ���� ���� �������� ����մϴ�.
 */

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("����ְų� �����ȭ���� ���� ���� �켱���� ��⿭�� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
		
	}

}
