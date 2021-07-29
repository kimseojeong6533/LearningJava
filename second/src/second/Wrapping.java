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
	public static void WrapBox(Boxes box) {  // ���� ���� Ŭ������ �Ű������� (����Ŭ������ Ÿ��ĳ������ �����ϴϱ�)
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