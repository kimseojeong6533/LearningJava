package multi_thread;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;  //멤버변수이므로 default = 0 setting
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start;i<=end;i++) {
			total += i;
		}
		
	}

	public static void main(String[] args) {
		
		JoinTest jt1 = new JoinTest(1,50);
		JoinTest jt2 = new JoinTest(51,100);
		
		jt1.start();
		jt2.start();
		
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {  // jt1과 jt2가 Runnable상태로 돌아오지 못했을 경우에도, main 쓰레드가 수행될 수 있도록 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total_sum = jt1.total + jt2.total;
		
		System.out.println("jt1.total : "+jt1.total);
		System.out.println("jt2.total : "+jt2.total);
		System.out.println("total_sum : "+total_sum); // join()추가전 = 0 (jt1.start(), jt2.start()가 아직 실행중인 상태이므로, total_sum에 아무것도 더해지지 않아 0)
	
	
	} 

}
