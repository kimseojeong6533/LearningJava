package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {  
		
		int num = 10;                    // i�� �Ű�����, num�� �������� -> stack�޸� 
		
		class MyRunnable implements Runnable{  // Outer2�� getRunnable�޼��� �ȿ��� ����� ���� Ŭ���� MyRunnable
			
			@Override
			public void run() {
				//num = 200;   // ���� ��. ��?    �޼��� ȣ������� Ŭ���� ���������� �ٸ��� ����.
				  					    //  ��, Outer2Ŭ������ ������ ��, outNum, sNum�� �ʱ�ȭ �� ����������, 
									    //  getRunnable�޼���� ���״�� �޼����̱� ������ Outer2Ŭ������ �̿��ؼ� �޼��带 ȣ���� ��, i�� num���� �ʱ�ȭ��
									    // ����, Outer2��� ������ outNum�� sNum�� ����Ŭ�������� ���� �Ǵ� �� ������ ����������, 
				                        // �Ű����� i�� �������� num�� ���ٸ� �����ϵ��� �����Ϸ��� ó���� ��, FInal��(���ȭ)���� �ڵ������� �̷����.
								        
				
				//i = 10;      //���� �� (���� ���� ���ٸ� ����)
				
				
				
				int localnum = 1000;
				System.out.println("�Ű����� i : "+ i);          
				System.out.println("�������� num : " + num);
				System.out.println("localnum : "+ localnum);
				
				System.out.println("outNum : "+outNum + "�ܺ� Ŭ���� �ν��Ͻ� ����");
				System.out.println("Outter.sNum : " + Outer2.sNum + "�ܺ� Ŭ���� ���� ����");

				
			}
			
		}
		return new MyRunnable();  // getRunnable()�̶�� �Լ����ο� ����� Ŭ������ ����
	}
		
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		
		Outer2 out2 = new Outer2();
		out2.getRunnable(10).run();
		
		
	}

}
