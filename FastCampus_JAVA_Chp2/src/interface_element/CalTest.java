package interface_element;

/**
 Calc(Interface) <---- Calculator(Abstract Class)  <------ CompleteCalc(Class) 
=> CompleteCalc�� Calc �������̽��� ������ Ŭ������ ��� -> Calc������ ���� ���� 
*Ŭ���� ��Ӱ� �޸� ���� �ڵ尡 �����Ƿ� ���� �������̽��� ������ �� ���� 


*�������̽��� �� ����ϴ°�?
-Ŭ������ ���α׷��� �����ϴ� ����� ��������� �����ϴ� �� = �������̽��� ���� �� ���
-������ Ŭ���̾�Ʈ �ڵ���� ���, Ŭ������ ���α׷��� �����ϴ� ��(specification)
-Ŭ���̾�Ʈ ���α׷��� �������̽��� ����� �޼��� ���� ���� �̸� ������ Ŭ������ ����� �� ����. ���� �������� Ŭ���̾�Ʈ�ܿ��� �� �ʿ䰡 �������� ȿ��.    (Ŭ���̾�Ʈ  --->  �������̽� <---- ����) 
-� ��ü�� �ϳ��� �������̽�Ÿ���̴� = �ش� �������̽��� �����ϴ� ��� �޼ҵ带 ������ ��ü��� �ǹ�
-�������̽��� ������ �پ��� ��ü�� ����� = ������
ex) JDBC �������̽�
 */

public class CalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		CompleteCalc completecalc = new CompleteCalc();  
		
		
		Calc calc = new CompleteCalc();   // CompleteCalc�� calc �������̽��� ������ Ŭ����  -> �ν��Ͻ������� ����� Ŭ���� �ν��Ͻ� ������ ���� but, Calc�������̽��� �����ϴ� �޼��常 ��밡��.
		                                                          // �������̽��� ������ Ŭ������ �������̽� ������ ������ ������ �� ��ȯ �� �� ����
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.mul(num1, num2));
		System.out.println(calc.div(num1, num2));
		//calc.printNum(); <- ����,  Calc�������̽��� ������� ���� �޼ҵ��̹Ƿ� ���Ұ�.
		
		
		calc.description();  
		
		int [] array = {1,2,3,4,5};
		System.out.println("�迭�� ���� : "+Calc.total(array));   // �����޼����̹Ƿ� �ν��Ͻ� �������� �ش� �޼��尡 �����ϴ�Ŭ�������� �̿��ؼ� ��밡��
		
		
		

	}

}
