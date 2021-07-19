package second;

class Box{
	private String conts;
	Box(String cont){
		this.conts = cont;
	}
	
	public String toString() {
		return conts;
	}
	
}

public class AutoCallToString {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);   // println은 참조값이 반환되었을 때, 자동으로 toString메소드를 호출하여 반환된 문자열 결과를 출력하게 된다.
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		System.out.println(box);

	}

}
