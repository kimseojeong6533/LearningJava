package first;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		
		System.out.println(i1);
		System.out.println(i2); // 음수인 값이 +처리를 한 변수는 해당 음의값 그대로 출력된다. 
		
		int i3 = -i1;           // 음수인 값에 -처리를 한 변수는 양의값으로 출력
		System.out.println(i3);
		
		int i4 = ++i3;          //i3(5)에 ++를 하면, i3는 6으로 바뀌에 되고, 6이 i4에 담긴다.
		System.out.println(i4); 
		System.out.println(i3);
		System.out.println('\n');
		int i = 5;
		int j = 2;
	    System.out.println(i +  j);
	    System.out.println(i -  j);
	    System.out.println(i *  j);
	    System.out.println(i /  (double)j);  
	    System.out.println(i %  j);  
	    System.out.printf("i를 j로 나눈 나머지값 : %d\n",i%j);
		

	}

}
