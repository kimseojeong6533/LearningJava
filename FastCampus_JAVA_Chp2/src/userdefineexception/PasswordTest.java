package userdefineexception;

import java.util.Scanner;

/**
 
 사용자 정의 예외 클래스 구현하기
 - 자바에서 제공되는 예외 클래스외에 프로그래머가 직접 예외를 만들어야 하는 경우가 있음
 - 기존 예외 클래스 중, 가장 유사한 예외 클래스를 상속받아 사용자 정의 예외 클래스를 만듦. 
 - 기본적으로 Exception클래스를 상속해서 만들수 있다  ->  Ex. PasswordException throws Exception
 
 */

public class PasswordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException{
		//비밀번호가 null일수 없고, 비밀번호의 길이가 5이상이며, 문자로만 이루어지면 안됨
		
		if(password==null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다");
		}
		else if(password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다");
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
				System.out.println("비밀번호 설정완료");
				break;
			} catch (PasswordException e){
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("종료");
		
	}


	

}
