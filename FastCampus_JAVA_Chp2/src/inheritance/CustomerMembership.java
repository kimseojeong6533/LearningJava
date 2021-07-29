package inheritance;

/**
 					     고객
 					
 		    일반고객        VIP고객
    * 상속은 클래스간의 결합도가 높은 설계
    
    *상속은 언제 사용할까? 
     -> IS-A관계 :  일반적인 개념 - 구체적인 개념 (Employee - (Engineer, Manager,...)
     
     
      *HAS-A관계(composition관계) : 클래스가 다른 클래스를 포함하는 관계  (Student - Subject , 학생은 여러개의 과목을 수강한다.)
     
 
 */

public class CustomerMembership {

	public static void main(String[] args) {
		Customer customerLee = new Customer();    
		customerLee.setCustomerName("김고양");
		customerLee.setCustomerId(1000);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer kim = new VIPCustomer();
		kim.setCustomerName("김서정");
		kim.setCustomerId(2000);
		kim.bonusPoint = 10000;
		System.out.println(kim.showCustomerInfo());
		
		Customer customerShin = new Customer(1002,"Shineehyeon");
		System.out.println(customerShin.showCustomerInfo());
		
		VIPCustomer Park = new VIPCustomer(10001,"Parksin");
		System.out.println(Park.showCustomerInfo());
		
		
		Customer vc = new VIPCustomer();  
		Customer vc2 = new VIPCustomer(10003,"Hong");  
		// VIPCustomer() 생성자에 의해 VIP클래스의 모든 멤버변수(customerGrade,, bonusRatio, salesRatio)에 대한 메모리는 생성되었지만, 
		// 변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드임. (VIPCustomer의 변수와 메서드에 접근 불가)
		// VIPCustomer()의 인스턴스는 Customer형으로 형변환이 가능하다
		// 즉, 하위클래스 인스턴스는 상위클래스 형으로 형변환 가능 = up casting (하위 클래스 : 상위클래스 속성 + 추가 속성)
     	// 클래스1 <-- 클래스2 <--클래스3 인 경우, 클래스3에서 클래스1 또는 클래스2로 업캐스팅이 가능하다. (계층구조 깊이에 상관없이 하위라면 상위클래스로 캐스팅 가능)

	}

}
