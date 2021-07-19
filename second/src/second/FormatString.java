package second;


/**
 %d 10진수 정수 출력 
 %o  8진수 정수 출력
 %x  16진수 정수 출력
 %f   실수 출력
 %e   e표기법 기반 실수 출력    (1.0 x 10^(-20) = 1.0e-20  | 1.0 x 10^(20) = 1.0e+20   )
 %g   출력의 대상에 따라 %e 또는 %f 형태로 출력
 %s   문자열 출력
 %c   문자 출력
 */ 

public class FormatString {

	public static void main(String[] args) {
		int age = 20;
		double height = 178.2;
		String name = "YOON SUNG WOO";
		
		System.out.printf(" name : %s\n",name);
		System.out.printf(" age : %d\n height : %e \n\n",age, height);
		System.out.printf(" %d - %o - %x  \n\n", 77,77,77);
		System.out.printf("%g   \n", 0.00014);
		System.out.printf("%g   \n", 0.000014);
		

	}

}
