package second;

/**
 메소드 오버라이딩 : 상위 클래스에 정의된 메소드를 하위클래스에서 재정의하는 것
 
 */

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	protected void answer() {
		System.out.println("Hi~ from "+number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in "+androidVer);
	}
	
}

public class MobileSmartPhoneRef {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-1234-5678","Nougat");
		MobilePhone ph2 = new SmartPhone("010-999-9999","Nougat");  // 상위클래스(MobilePhone)의 참조변수(ph2)는 하위클래스의 인스턴스(new SmartPhone)를 참조할 수 있음.
		
		//ph1은 Smartphone객체이자, Mobilephone객체이기도하다.
		
		ph1.playApp();
		ph1.answer();
		
		ph2.answer();
	   //ph2.playApp();  // <- 불가하다
       // 상위클래스의 참조변수는 참조변수 형에 해당하는 클래스(MobilePhone)와 
	   //그 클래스의 상위클래스에 정의된 메소드들만 호출가능. 그 클래스의 하위클래스에 정의된 메소드들은 호출불가 
		

	}

}
