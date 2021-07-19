package second;

class SuperCLS{
	public SuperCLS() {
		System.out.println("Con : SuperCLS()");
	}
	public SuperCLS(int i) {
		System.out.println("Con : SuperCLS(int i)");
	}
	public SuperCLS(int i, int j) {
		System.out.println("Con : SuperCLS(int i, int j)");
	}
	
}

class SubCLS extends SuperCLS{
	public SubCLS() {
		//super() 이 자동으로 삽입됨. 즉, 명시적으로 어떤 상위 클래스 생성자를 호출할 것인지 쓰지 않으면, 인자를 받지않는 상위 클래스의 생성자 호출문이 실행됨.
		System.out.println("Con : SubCLS()");  
	}
	public SubCLS(int i) {
		super(i);   // super : 명시적으로 상위 클래스의 생성자를 호출,   super를 이용한 상위 클래스의 생성자 호출문은 생성자의 첫문장으로 등장해야 함. 
		System.out.println("Con : SubCLS(int i)");
	}
	public SubCLS(int i, int j) {
		super(i,j);
		System.out.println("Con : SubCLS(int i, int j)");
	}
}



public class superSubCon2 {

	public static void main(String[] args) {
		
		System.out.println("1.  ");
		new SubCLS();                 // 하위 클래스의 인스턴스 생성시, 상위클래스의 생성자 그리고 하위 클래스의 생성자순으로 모두 호출된다. 
		System.out.println();
		
		System.out.println("2.  ");
		new SubCLS(1);
		System.out.println();
		
		System.out.println("3.  ");
		new SubCLS(1,2);
		System.out.println();
		
	}

}
