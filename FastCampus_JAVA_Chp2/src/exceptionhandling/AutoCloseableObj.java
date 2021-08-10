package exceptionhandling;

//AutoCloesable인터페이스 구현해보기
public class AutoCloseableObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("closing...");
	}
	
	
	

}
