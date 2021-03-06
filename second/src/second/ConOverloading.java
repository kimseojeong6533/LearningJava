package second;

/**  메소드 오버로딩 : 
 *   본래, 한 클래스내에 동일한 이름을 가진 메소드를 둘이상 정의하는 것은 허용되지 않음. but, 매개변수의 선언이 다르면 가능해짐
 *   호출할 메소드를 찾을 때 : 1. 메소드의 이름  2. 메소드의 매개변수 정보(수, 타입) 
 *   따라서, 매개변수의 선언이 다르다면, 동일한 이름의 메소드 정의를 하용하는 것을 메소드 오버로딩이라고 한다. 
 *   
 *   보통, 오버로딩된 메소드 정의들을 위에서부터 아래로 훑어서 가장 가까운 메소드가 호출되게 된다. 
 *   또한, 생성자도 오버로딩의 대상이 된다. 
 */


class Person{
	private int regiNum; // 주민등록번호
	private int passNum; // 여권번호
	
	Person(int rnum, int pnum){
		regiNum = rnum;
		passNum = pnum;
	}
	Person(int rnum){
		this(rnum,0);          // this를 이용해, 첫번째로 정의된 생성자를 사용할 수 있음
//		regiNum = rnum;
//		passNum = 0;
	}
	
	void showPersonInfo() {
		System.out.println("주민등록번호 : "+regiNum);
		
		if(passNum==0) {
			System.out.println("여권번호없음\n");
		}
		else {
			System.out.println("여권번호 : "+passNum+"\n");
		}
	}
}



public class ConOverloading {   // 생성자도 오버로딩의 대상이다.

	public static void main(String[] args) {
		Person jung = new Person(960229,101010);
		Person elsa = new Person(111111);
		
		jung.showPersonInfo();
		elsa.showPersonInfo();

	}

}
