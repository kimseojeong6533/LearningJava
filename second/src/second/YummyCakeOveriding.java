package second;

/**
 * <상속 관계에서 메소드 호출문제>
 GrandParent(void Talking()...)<--- Parent(p){void MakeMoney()...} <--- Son(s) {void Study()...}  
 
 상위클래스 참조변수(p)는 하위클래스의 인스턴스(s)를 참조가능.
 but, 상위클래스 참조변수(p)는 하위클래스에 정의된 메소드 호출(Study())이 불가함. 
 *상위클래스 참조변수 p는 해당 클래스의 메소드(MakeMoney()..)와 해당 클래스의 상위클래스(GrandParent)의 메소드(Talking()...)만 호출가능함.
 
하위클래스에 정의된 메소드를 상위클래스 참조변수가 호출하려면, 하위클래스 형으로 명시적 타입캐스팅을 해야함.
즉, 상위클래스가 하위클래스에 정의된 메소드를 호출하고 싶을때 => (하위클래스형) 상위클래스_참조변수이름 

 */

class Cake{
	int cakeNum;
	public Cake() {
		cakeNum = 0;
	}
	
	public Cake(int num) {
		cakeNum = num-1;
	}
	public void sweet() {
		System.out.println("Cake");
	}
	
}

class CheeseCake extends Cake{
	int cheeseCakenum;
	public CheeseCake() {
		super();
		cheeseCakenum = 0;
	}
	
	public CheeseCake(int num) {
		super(num);
		cheeseCakenum = num+1;
	}
	public void milky() {
		System.out.println("CheeseCake");
	}
}

class StrawberryCheeseCake extends CheeseCake{
	public void sour() {
		System.out.println("StrawberryCheeseCake");
	}
}

public class YummyCakeOveriding {

	public static void main(String[] args) {
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1;
		ca2.sweet();  // 상위클래스형 참조변수는 해당 클래스내 메소드호출이 가능
		//ca2.milky()  //<- 오류,  하위 클래스의 메소드는 호출 불가
		
		Cake ca3 = new CheeseCake();  // 상위클래스형 참조변수는 하위클래스 인스턴스를 참조가능.
		//CheeseCake ca4 = ca3; // <- 오류, 하위클래스형 참조변수는 상위클래스형으로 정의된 참조변수에 접근x
		CheeseCake ca4 = (CheeseCake) ca3; // 상위클래스형 참조변수를 하위클래스형으로 타입캐스팅하면, 하위클래스형 참조변수가 해당 참조변수에 접근가능
		ca4.milky();
		ca4.sweet();    // 어떤 클래스의 참조변수는 해당 클래스내 메소드 + 해당 클래스의 상위클래스내 메소드 모두 호출가능
		
		System.out.println();
		
		
		/**
		 <이해하기까지 시행착오 ㅋㅋ>
		 CheeseCake ca1 = new CheeseCake();  // ca2는 CheeseCake객체이자, Cake객체이다.
		Cake ca2 = ca1;   // 따라서, Cake의 참조변수가 ca2(CheeseCake 인스턴스)를 참조하는 것이 가능하다.
		                                //  ㄴ상위클래스의 참조변수는 하위클래스의 인스턴스를 참조할 수 있으므로 
		ca2.sweet(); 
		ca2.milky();  // 단, ca2는 Cake(상위클래스) 인스턴스이기 때문에, CheeseCake 메소드에 접근하는 것이 불가능하다.
		
		Cake ca3 = new CheeseCake();  // ca3는 Cake클래스의 참조변수이므로, 하위 클래스인 CheeseCake클래스에 접근가능하다.
		//CheeseCake ca4 = ca3;  // 그러나, 하위클래스 참조변수 ca4는 상위 클래스 참조변수인 ca3에 접근하지 못한다? 
		CheeseCake ca4 = (CheeseCake) ca3; // 그러나 상위클래스 참조변수를 명시적으로 하위클래스 형으로 형바꿈을 해주면, 하위클래스 메소드까지 접근가능하다.
		ca4.milky();
		
		Cake ca5 = new CheeseCake(5);   // Cake(상위클래스)참조변수 ca5가 하위클래스를 참조할 수 있도록 선언.
		System.out.println(ca5.cakeNum);
		CheeseCake ca6 = (CheeseCake)ca5;  // CheeseCake(하위클래스) 참조변수 ca6는 
		System.out.println(ca6.cheeseCakenum);
		ca6.milky();
		
		CheeseCake ca1 = new CheeseCake();  // ca2는 CheeseCake객체이자, Cake객체이다.
		Cake ca2 = (Cake) ca1;   // 따라서, Cake의 참조변수가 ca2(CheeseCake 인스턴스)를 참조하는 것이 가능하다.
		                                //  ㄴ상위클래스의 참조변수는 하위클래스의 인스턴스를 참조할 수 있으므로 
		ca2.sweet(); 
		//ca2.milky();  // 단, ca2는 Cake(상위클래스) 인스턴스이기 때문에, CheeseCake 메소드에 접근하는 것이 불가능하다.

		 */

	}

}
