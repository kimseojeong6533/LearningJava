package multi_thread;

class MyThread extends Thread{
	// Thread를 상속했을 때, 구현해야하는 메서드는 없음 단, Mythread가 수행이 시작되면, Run메서드가 수행. 
	public void run() {
		int i;
		for(i = 1;i<=200;i++) {
			System.out.print(i+"\t");
		}
	}
	
}

class MyThread2 implements Runnable{

	@Override
	public void run() {   // Runnable인터페이스를 구현할 때에는 Run메서드를 재정의 해야함. 
		for(int i = 1;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
	}
	
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()+"start");  // -> [Thread를 부른 메서드이름, Priority, Thread가 속한 그룹]

		// 1) 
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();                                    // main에 속한 쓰레드, 직접 만든 t1, t2 => 3가지 쓰레드
		
//		t1.start();   // start()를 하면 자동으로 run()메서드가 실행됨.
//		t2.start();
		
		
		// 2)
		MyThread2 runnable = new MyThread2();
		Thread th1 = new Thread(runnable);  // Runnable객체를 Thread클래스에 끼워주면 -> 수행 
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
		
		// main에 속한 쓰레드가 먼저 시작되고 끝나는 것을 확인할 수 있다. 

	}

}
