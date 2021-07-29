package singletone_Exercise;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();  
		Company com2 = Company.getInstance();  
		
		System.out.println(com1);    
		System.out.println(com2);   // -> 둘다 같은 참조값이 출력됨(static으로 선언했으므로)
		
		Calendar calendar = Calendar.getInstance();    // 실제 싱글톤 예시
		
	}

}
