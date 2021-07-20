package second;


/**
 @Override 의 기능 : 오버라이딩할 메소드를 컴파일에게 알려주는 역할. 
                                    제대로 오버라이딩이 되지 않았다면, 컴파일단계에서 에러메시지를 띄움.
 */
class ParentAdder{
	public int add(int a, int b) {
		System.out.println("Parent add : ");
		return a+b;
	}
}

class ChildAdder extends ParentAdder{
	@Override   
	public int add(int a, int b) {  // 오버라이딩 
		System.out.println("childadd : ");
		return a+b;
	}
}

public class Annotation {

	public static void main(String[] args) {
		//ParentAdder p = new ParentAdder();
		ParentAdder c = new ChildAdder();
		
		System.out.println(c.add(4, 5));
		

	}

}
