package second;

class Circle {

	private double rad = 0;            
	private final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	
	public void setRad(double r) {  // 게터(Getter) : 값을 참조하기 위한 메소드 (get...이라고 짓는것이 관례) 
		if(r<0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	
	public double getArea() {     // 원의 넓이 구하기    // 세터(Setter) : 값을 설정하기 위한 메소드 (set... 이라고 짓는것이 관례)
		return (rad*rad)*PI;
	}

}


public class UnsafeCircle {
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println("해당 원의 넓이는 : "+c.getArea());
		
		c.setRad(2.5);
		System.out.println("해당 원의 넓이는 : "+c.getArea());
		
		c.setRad(-3.3);
		System.out.println("해당 원의 넓이는 : "+c.getArea());
		
		// c.rad = -4.5;  // 인스턴스 변수의 직접적인 접근을 허용하지 않는 것 : 정보은닉  -> rad변수를 public에서 private으로 바꾸어줌
		// private변수 : 클래스 내부에서만 접근을 허용하겠다 는 뜻 (클래스 외부에서 private으로 선언된 변수에 접근할 경우, 컴파일 오류가 발생함) 
		// System.out.println(c.getArea());    
		
		
	}
}






