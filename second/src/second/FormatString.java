package second;


/**
 %d 10���� ���� ��� 
 %o  8���� ���� ���
 %x  16���� ���� ���
 %f   �Ǽ� ���
 %e   eǥ��� ��� �Ǽ� ���    (1.0 x 10^(-20) = 1.0e-20  | 1.0 x 10^(20) = 1.0e+20   )
 %g   ����� ��� ���� %e �Ǵ� %f ���·� ���
 %s   ���ڿ� ���
 %c   ���� ���
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
