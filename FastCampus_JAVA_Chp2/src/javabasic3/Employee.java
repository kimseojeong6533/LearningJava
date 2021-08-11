package javabasic3;

public class Employee {

	public static int serialNum = 100;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	public static int getSerialNum() {   //static �Լ� : Ŭ���������� ȣ���� ������ �Լ�
		//employeeName = "Lee";      <- ���� : employeeName�� �ν��Ͻ� ���� ��, �ν��Ͻ������� �־�� ������ ������ �����ε�, �Լ��� �ν��Ͻ��������� Ŭ���������� ȣ���� ������ �Լ��� ���ǵǾ� �����Ƿ� �����߻�
		int i = 0;    // ��������(�Լ��� ����Ǿ��� ��, �޸� �����ǹǷ� ���������� static�Լ����ο� ��밡��) 
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
