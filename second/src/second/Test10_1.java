package second;


class Accumulator{
	
	static int num;
	
	static {
		num = 0;
	}
	
//	Accumulator(){    // 생성자는 필요없더라도 직접 정의해주는 것이 좋다. 
//		
//	}
	
	static void add(int n) {
		num+=n;
	}
	
	static void showResult() {
		System.out.println("sum = "+num);
	}
	
}

public class Test10_1 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();

	}

}
