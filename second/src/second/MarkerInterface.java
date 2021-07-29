package second;

interface Upper {}  //��Ŀ�������̽� (Ŭ������ ���̴� ǥ������ ��� ��, �빮�ڷ� ����϶�� ǥ��)
interface Lower {} // ��Ŀ �������̽� (Ŭ������ ���̴� ǥ������ ��� ��, �ҹ��ڷ� ����϶�� ǥ��)

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
		Report doc = new Report("Simple Funny News~"); // Printable4, Upper�������̽��� �����ϴ� ReportŬ������ �ν��Ͻ� doc
		prn.printContents(doc);  
		
	}
}


