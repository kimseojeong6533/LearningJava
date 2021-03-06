package second;

class Boxes{
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Boxes{
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("Gold PaperBox Wrapping");
	}
}

public class Wrapping {

	public static void main(String[] args) {
		Boxes box1 = new Boxes();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		WrapBox(box1);
		WrapBox(box2);
		WrapBox(box3);
		
	}
	public static void WrapBox(Boxes box) {  // 가장 상위 클래스를 매개변수로 (하위클래스로 타입캐스팅이 가능하니깐)
		if(box instanceof GoldPaperBox) {  
			((GoldPaperBox) box).goldWrap();
		}
		
		else if(box instanceof PaperBox) {
			((PaperBox) box).paperWrap();  
		}
		
		else {
			box.simpleWrap();
		}
		
	}
		

}
