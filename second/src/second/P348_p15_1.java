package second;

class Boxes2{
	public void Wrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox2 extends Boxes2{
	public void Wrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox2 extends PaperBox2{
	public void Wrap() {
		System.out.println("Gold PaperBox Wrapping");
	}
}

public class P348_p15_1 {

	public static void main(String[] args) {
		Boxes2 box1 = new Boxes2();
		PaperBox2 box2 = new PaperBox2();
		GoldPaperBox2 box3 = new GoldPaperBox2();
		
		box1.Wrap();
		box2.Wrap();
		box3.Wrap();
		

	}

}
