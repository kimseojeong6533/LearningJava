package singletone_Exercise;

/**
 Singletone 패턴 : 디자인 패턴중의 하나로, 하나으 인스턴스로만 프로그램을 구성해야하는 경우 사용하는 객체지향 프로그래밍 기법(with Static변수, Static메소드)
 
 */
public class Company {

	private static Company instance = new Company();  // 유일한 인스턴스 생성(참조변수 : instance)
	
	private Company() {
		
	}
	public static Company getInstance() {    // 외부에서 Company클래스에 생성한 인스턴스를 사용할 수 있도록 static으로 메소드를 선언해줌.
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}

}
