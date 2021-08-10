package exceptionhandling;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseableObj obj = new AutoCloseableObj();
		
		// try���� ����ǰ� ����Ǹ�, AutoCloseableObj�� close()�� �ڵ����� ȣ��Ǿ� Overriding�� �޼��尡 �����.
		try(obj){
			throw new Exception();   // Exception�� ������ ���� (catch���� Exception�� ����) 
	// ��, try�� ���� -> Exception �߻� -> try���� -> Close()���� -> Exception���࿡ ���� catch�� ���� -> catch�� ���� 
   
		} catch (Exception e) {
			System.out.println("exception ");
		}
		
		System.out.println("end");
	}

}
