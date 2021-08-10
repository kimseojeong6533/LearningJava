package exceptionhandling;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseableObj obj = new AutoCloseableObj();
		
		// try문이 실행되고 종료되면, AutoCloseableObj의 close()가 자동으로 호출되어 Overriding한 메서드가 실행됨.
		try(obj){
			throw new Exception();   // Exception이 강제로 생성 (catch문의 Exception이 실행) 
	// 즉, try문 실행 -> Exception 발생 -> try종료 -> Close()실행 -> Exception실행에 의해 catch문 실행 -> catch문 종료 
   
		} catch (Exception e) {
			System.out.println("exception ");
		}
		
		System.out.println("end");
	}

}
