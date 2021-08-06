package innerclass;


/**
 * <Inner Class, 내부 클래스> - 실제로 많이 사용되지는 않음
 클래스안에 클래스 = 내부 클래스, 중첩 클래스. 이때, static으로 내부 클래스를 설정하는 것도 가능하다.
 - 클래스 내부에 선언한 클래스로 이 클래스를 감싸고 있는 외부 클래스와 밀접한 연관이 있는 경우가 많고,
    다른 외부 클래스에서 사용할 일이 거의 없는 경우에 내부 클래스로 선언해서 사용
 - 내부 클래스 종류 : 인스턴스 내부 클래스 / 정적 내부 클래스 / 지역(local) 내부 클래스 / 익명(anonymous) 내부 클래스
  
  *인스턴스 내부 클래스(Instance Inner Class)
   - private으로 선언(하는 것을 권장)
   - private이 아닌 내부 클래스는 다른 외부 클래스에서 생성가능 
  
  * 정적 내부 클래스(Static inner Class)
   - 외부 클래스 생성과 무관하게 사용가능(Static)
   - 정적 변수, 메서드 사용  
  
  * 지역 내부 클래스 (Local Inner Class)
   - 지역변수 처럼 메서드 내부에서 정의하여 사용하는 클래스
   - 메서드 호출이 끝나면, 메서드에 사용된 지역변수의 유효성이 사라짐
   - 메서드 호출이후에도 사용해야하는 경우가 있을 수 있기 때문에, 지역 내부 클래스에서 사용하는 메서드의 지역변수나 매개변수는 Final로 선언됨. 
  
  * 익명 내부 클래스(Anonymous Inner Class)
   - 이름이 없는 클래스
   - 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
   - 인터페이스나 추상클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환가능.
   - widget의 이벤트 핸들러에 활용됨.
   
   
 */
class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();  // OutClass 클래스가 생성되면 Inclass가 생성됨 -> 
	}
	
	class InClass{     // 클래스 안에 클래스 선언
		int iNum = 100;
		//static int sInNum = 500;   // <- 오류(OutClass 인스턴스가 생성되어야 InClass내 변수와 메서드를 사용할 수 있으므로 멤버변수로(static) 접근불가하기 때문
		void inTest() {
			
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");    // Outclass의 private변수이므로 사용가능
			System.out.println("OutClass num = " + sNum + "(외부 클래스의 인스턴스 변수)"); // Outclass의 private변수이므로 사용가능
			System.out.println("InClass num = " + iNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println();
		}		
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {   // 정적내부 클래스
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
					
			//System.out.println("InClass num = " + iNum + "(외부 클래스의 인스턴스 변수)");    // <- 오류, 왜? static 변수가 아니므로 (인스턴스생성없이 멤버변수로 접근할수 없으므로)
			System.out.println("OutClass num = " + sNum + "(외부 클래스의 인스턴스 변수)");  
			System.out.println("InClass num = " + sInNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println();
		}
		
		static void sTest() {  //정적 메서드
			
			System.out.println("OutClass num = " + sNum + "(외부 클래스의 인스턴스 변수)");  
			System.out.println("InClass num = " + sInNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println();
			
		}
	}
}

public class InnerClassTest{
	
	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		outclass.usingClass();
		OutClass.InClass inner = outclass.new InClass();   //내부 클래스 인스턴스 선언 

		// Outclass안에 있는 InClass 인스턴스를 생성하기 위해서는 
		// 1. OutClass인스턴스를 만듦(outclass)
		// 2. 1에서 만든 인스턴스에 대해 new 처리(outclass.new InClass())를 해줌 
		
		OutClass.InStaticClass.sTest();  // inTest는 멤버 메서드로 선언X 
		
		OutClass outclass2 = new OutClass();
		OutClass.InStaticClass instaticclass = new OutClass.InStaticClass();  // 정적내부클래스 인스턴스 선언 (그냥 내부 클래스 인스턴스를 선언하는 것과 다르다)
		instaticclass.inTest();
		
	}
	
}


