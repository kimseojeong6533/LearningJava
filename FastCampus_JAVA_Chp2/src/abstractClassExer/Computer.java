package abstractClassExer;

public abstract class Computer {   // 추상메서드를 포함한 클래스 : 추상클래스  *추상 클래스는 new 할 수 없음 ( 인스턴스화 할 수 없음 )
	public abstract void display();   // 추상메서드  -> 상속받는 클래스들이 추상클래스들을 구현함
	public abstract void typing();    // 추상메서드
	
	void turnOn() {
		System.out.println("전원을 킵니다");
	}
	void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
