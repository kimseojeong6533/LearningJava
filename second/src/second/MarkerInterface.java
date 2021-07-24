package second;

interface Upper {}  //마커인터페이스 (클래스에 붙이는 표식으로 사용 즉, 대문자로 출력하라는 표식)
interface Lower {} // 마커 인터페이스 (클래스에 붙이는 표식으로 사용 즉, 소문자로 출력하라는 표식)

interface Printable4{
	String getContents();
}

class Report implements Printable4, Upper{
	String cons;
	Report(String cons){
		this.cons = cons;
	}
	
	public String getContents() {
		return cons;
	}
}

class Printer4 {
	public void printContents(Report p) {
		if(p instanceof Upper) {
			System.out.println((p.getContents()).toUpperCase());
		}
		
		else if(p instanceof Lower) {
			System.out.println((p.getContents()).toLowerCase());
		}
		
		else
			System.out.println(p.getContents());
	}
}

public class MarkerInterface {

	public static void main(String[] args) {
		
		Printer4 prn = new Printer4();   
		Report doc = new Report("Simple Funny News~"); // Printable4, Upper인터페이스를 구현하는 Report클래스의 인스턴스 doc
		prn.printContents(doc);  
		
	}
}



