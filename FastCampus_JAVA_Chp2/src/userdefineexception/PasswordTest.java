package userdefineexception;

import java.util.Scanner;

/**
 
 ����� ���� ���� Ŭ���� �����ϱ�
 - �ڹٿ��� �����Ǵ� ���� Ŭ�����ܿ� ���α׷��Ӱ� ���� ���ܸ� ������ �ϴ� ��찡 ����
 - ���� ���� Ŭ���� ��, ���� ������ ���� Ŭ������ ��ӹ޾� ����� ���� ���� Ŭ������ ����. 
 - �⺻������ ExceptionŬ������ ����ؼ� ����� �ִ�  ->  Ex. PasswordException throws Exception
 
 */

public class PasswordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException{
		//��й�ȣ�� null�ϼ� ����, ��й�ȣ�� ���̰� 5�̻��̸�, ���ڷθ� �̷������ �ȵ�
		
		if(password==null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�");
		}
		else if(password.length()<5) {
			throw new PasswordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�");
		}
		
		
		this.password = password; 
		
	}
	
	public static void main(String[] args) {
		
		while(true) {
			PasswordTest test = new PasswordTest();
			
			Scanner sc = new Scanner(System.in);
			String password = sc.next();
			
			try {
				test.setPassword(password);
				System.out.println("��й�ȣ �����Ϸ�");
				break;
			} catch (PasswordException e){
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("����");
		
	}


	

}
