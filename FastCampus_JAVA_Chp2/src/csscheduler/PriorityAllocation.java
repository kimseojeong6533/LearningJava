package csscheduler;

/**
 ���� ��޿� ���� ����� ���� ���� �����ɷ��� ����� �������� ����մϴ�.
 */

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("���� ��޿� ���� ����� ���� ���� �����ɷ��� ����� ������ ��⿭�� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
		
	}

}
