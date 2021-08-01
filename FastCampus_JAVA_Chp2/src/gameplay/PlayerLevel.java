package gameplay;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn(); 
	public abstract void showLevelMessage();
	
	final public void go(int count) {    // 템플릿메서드 : 코드의 흐름(시나리오)를 정의하는 메서드
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
		
	}
}
