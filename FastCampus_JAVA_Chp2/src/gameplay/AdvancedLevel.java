package gameplay;

public class AdvancedLevel extends PlayerLevel{

	public AdvancedLevel() {
		showLevelMessage();
	}
	
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("���� jump �մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn ��������");
		
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("******  �߱��� �����Դϴ�.  ******");
	}

}
