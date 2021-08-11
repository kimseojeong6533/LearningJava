package javabasic3;

public class Employee {

	public static int serialNum = 100;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	public static int getSerialNum() {   //static 함수 : 클래스명으로 호출이 가능한 함수
		//employeeName = "Lee";      <- 오류 : employeeName은 인스턴스 변수 즉, 인스턴스생성이 있어야 접근이 가능한 변수인데, 함수는 인스턴스생성없이 클래스명으로 호출이 가능한 함수로 정의되어 있으므로 오류발생
		int i = 0;    // 지역변수(함수가 종료되었을 때, 메모리 해제되므로 지역변수는 static함수내부에 사용가능) 
		return serialNum;     
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public void getEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
