package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee kim1 = new Employee();    // kim1�̶�� ���������� �����Լ� �ȿ� ����� �������� -> kim1�̶�� ���������� ���ø޸𸮿� �Ҵ� + kim1�� �����ϴ� �ν��Ͻ��� �� �޸�(�����޸�)�� �Ҵ�  
		Employee kim2 = new Employee();    // kim2�̶�� ���������� �����Լ� �ȿ� ����� �������� -> kim2�̶�� ���������� ���ø޸𸮿� �Ҵ� + kim2�� �����ϴ� �ν��Ͻ��� �� �޸�(�����޸�)�� �Ҵ� 
		                                                              
		
		kim1.serialNum++;
		Employee.serialNum++;                      // static����(��������) -> �����Ϳ���, static������ Ŭ���� ������ ��밡��(�ν��Ͻ����� ���� �ٷ� Ŭ���������� ���ٰ���)
		System.out.println(kim1.serialNum);
		System.out.println(kim2.serialNum);
		
		/**
		 
		 ������ ����    <-----------------      ���� �޸�    --------------->    �� �޸�
         serialNum(static)		                   kim1                                  kim1 �ν��Ͻ�
         													   kim2                                  kim2 �ν��Ͻ�
		 */
		

	}

}
