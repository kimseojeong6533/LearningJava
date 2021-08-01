package csscheduler;

/**
 쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.
 */

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("비어있거나 상담전화양이 적은 상담원 우선으로 대기열을 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");
		
	}

}
