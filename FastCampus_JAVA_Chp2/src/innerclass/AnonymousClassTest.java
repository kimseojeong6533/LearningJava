package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {  
		
		int num = 10;                    // i는 매개변수, num은 지역변수 -> stack메모리 
		
		class MyRunnable implements Runnable{  // Outer2내 getRunnable메서드 안에서 선언된 내부 클래스 MyRunnable
			
			@Override
			public void run() {
				//num = 200;   // 에러 남. 왜?    메서드 호출시점과 클래스 생성시점이 다르기 때문.
				  					    //  즉, Outer2클래스가 생성될 때, outNum, sNum이 초기화 및 생성되지만, 
									    //  getRunnable메서드는 말그대로 메서드이기 때문에 Outer2클래스를 이용해서 메서드를 호출할 때, i와 num값이 초기화됨
									    // 따라서, Outer2멤버 변수인 outNum과 sNum는 내부클래스에서 접근 또는 값 변경이 가능하지만, 
				                        // 매개변수 i와 지역변수 num은 접근만 가능하도록 컴파일러가 처리함 즉, FInal형(상수화)으로 자동적으로 이루어짐.
								        
				
				//i = 10;      //에러 남 (값에 대해 접근만 가능)
				
				
				
				int localnum = 1000;
				System.out.println("매개변수 i : "+ i);          
				System.out.println("지역변수 num : " + num);
				System.out.println("localnum : "+ localnum);
				
				System.out.println("outNum : "+outNum + "외부 클래스 인스턴스 변수");
				System.out.println("Outter.sNum : " + Outer2.sNum + "외부 클래스 정적 변수");

				
			}
			
		}
		return new MyRunnable();  // getRunnable()이라는 함수내부에 선언된 클래스를 리턴
	}
		
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		
		Outer2 out2 = new Outer2();
		out2.getRunnable(10).run();
		
		
	}

}
