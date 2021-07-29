package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee kim1 = new Employee();    // kim1이라는 참조변수는 메인함수 안에 선언된 지역변수 -> kim1이라는 참조변수는 스택메모리에 할당 + kim1이 참조하는 인스턴스는 힙 메모리(동적메모리)에 할당  
		Employee kim2 = new Employee();    // kim2이라는 참조변수는 메인함수 안에 선언된 지역변수 -> kim2이라는 참조변수는 스택메모리에 할당 + kim2이 참조하는 인스턴스는 힙 메모리(동적메모리)에 할당 
		                                                              
		
		kim1.serialNum++;
		Employee.serialNum++;                      // static변수(정적변수) -> 데이터영역, static변수는 클래스 변수로 사용가능(인스턴스생성 없이 바로 클래스명으로 접근가능)
		System.out.println(kim1.serialNum);
		System.out.println(kim2.serialNum);
		
		/**
		 
		 데이터 영역    <-----------------      스택 메모리    --------------->    힙 메모리
         serialNum(static)		                   kim1                                  kim1 인스턴스
         													   kim2                                  kim2 인스턴스
		 */
		

	}

}
