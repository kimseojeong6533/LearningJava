package second;

class SimpleBox{
	private int datae;
	
	SimpleBox(int data){
		this.datae = data;  // 매개변수 datas의 값을 인스턴스변수 data에 저장한다 는 의미
	}
	
	void setData(int datas) {
		this.datae = datas;
	}
	
	int getData() {
		return this.datae;
	}
}


public class ThisInst {

	public static void main(String[] args) {
		SimpleBox box = new SimpleBox(99);
		System.out.println(box.getData());
		
		box.setData(77);
		System.out.println(box.getData());

	}

}
