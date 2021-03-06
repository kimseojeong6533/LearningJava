package second;

class Business implements Cloneable{
	
	private String company;
	private String work;
	
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	
	public void showBusinessInfo() {
		System.out.println("회사 : "+this.company);
		System.out.println("일 : "+this.work);
	}
}

class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;
	
	public PersonalInfo(String name,int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company,work);
	}
	
	public void showPersonalInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		bz.showBusinessInfo();
	}
	
	public void changePersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company,work);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		PersonalInfo cpy = (PersonalInfo)super.clone();
		return cpy;
	}
}
public class P439_p19_2 {

	public static void main(String[] args) {
		PersonalInfo p1 = new PersonalInfo("김서정",26,"Naver","Front-end");
		System.out.println("변경전 : ");
		p1.showPersonalInfo();
		System.out.println("------------------------");
		PersonalInfo p2;
		
		try {
			p2 = (PersonalInfo)p1.clone();
			p1.changePersonalInfo("홍길동", 27, "Naver", "Back-end");
			System.out.println("변경후 : ");
			p1.showPersonalInfo();
			System.out.println();
			System.out.println("복사본 : ");
			p2.showPersonalInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
