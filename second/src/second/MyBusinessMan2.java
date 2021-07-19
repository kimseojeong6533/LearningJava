package second;

class Man{
	String name;
	
	public Man(String name) {
		this.name = name;   
	}
	public void tellYourName() {
		System.out.println("My name is "+name);
	}
}

class BusinessMan extends Man{
	String company;
	String position;
	
	public BusinessMan(String name, String company, String position) {
		super(name);
		//this.name = name;    이건 있든 없든 상관 무
		
		this.company = company;
		this.position = position;
		
	}
	
	public void tellYourInfo() {
		tellYourName();
		System.out.println("My company is "+company);
		System.out.println("My position is "+position);
		
	}
}



public class MyBusinessMan2 {

	public static void main(String[] args) {
		BusinessMan seojeong = new BusinessMan("Kimseojeong","Naver","Data Engineer");
		seojeong.tellYourInfo();

	}

}
