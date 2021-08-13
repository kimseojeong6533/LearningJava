package coffemachineprogram_project;

public abstract class Decorator extends Coffee{  // 상속용 상위클래스로만 사용하기 때문에, 함수를 이미 구현했더라도, 추상클래스로 선언해줌

	Coffee coffee;
	public Decorator(Coffee coffee) {  // 생성자 매개변수에 컴포넌트를 포함해야 함(Decorator 패턴의 특징) 
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
		
	}
	

}
