package multi_thread;

class MyThread extends Thread{
	// Thread�� ������� ��, �����ؾ��ϴ� �޼���� ���� ��, Mythread�� ������ ���۵Ǹ�, Run�޼��尡 ����. 
	public void run() {
		int i;
		for(i = 1;i<=200;i++) {
			System.out.print(i+"\t");
		}
	}
	
}

class MyThread2 implements Runnable{

	@Override
	public void run() {   // Runnable�������̽��� ������ ������ Run�޼��带 ������ �ؾ���. 
		for(int i = 1;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
	}
	
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()+"start");  // -> [Thread�� �θ� �޼����̸�, Priority, Thread�� ���� �׷�]

		// 1) 
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();                                    // main�� ���� ������, ���� ���� t1, t2 => 3���� ������
		
//		t1.start();   // start()�� �ϸ� �ڵ����� run()�޼��尡 �����.
//		t2.start();
		
		
		// 2)
		MyThread2 runnable = new MyThread2();
		Thread th1 = new Thread(runnable);  // Runnable��ü�� ThreadŬ������ �����ָ� -> ���� 
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread()+"end");
		
		// 3) 
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("1");
			}
		};
		run.run();
		
		// main�� ���� �����尡 ���� ���۵ǰ� ������ ���� Ȯ���� �� �ִ�. 

	}

}
