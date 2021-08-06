//package innerclass;
//
//class Outter2{
//	
//	public Object runner;
//
//
//	Runnable getRunnable(int i){
//
//		int num = 100;
//		
//		return new Runnable() {
//				
//		@Override
//		public void run() {
//			
//			System.out.println(i);
//			System.out.println(num);
//			
//			}
//		};  
//	
//	Runnable runner = new Runnable() {
//		
//		@Override
//		public void run() {
//			System.out.println("Runnable 이 구현된 익명 클래스 변수");
//			
//		}
//	}
//}
//
//
//public class AnonymousClassTest2 {
//
//	public void main(String[] args) {
//		Outter2 out = new Outter2();
//		
//		Runnable runnerble = out.getRunnable(10);
//		runnerble.run();
//		
//		((Runnable) out.runner).run();
//
//	}
//
//}
