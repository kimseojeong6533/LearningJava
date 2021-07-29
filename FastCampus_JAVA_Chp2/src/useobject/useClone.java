package useobject;

public class useClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(200,"Lee");
		Student cpyStudent = (Student) std1.clone();  
		
		std1.setStudentName("Park");  //Lee -> Park으로 name이 변경
		System.out.println(std1);
		System.out.println(cpyStudent);
		
		System.out.println();
		System.out.println(System.identityHashCode(std1));                   //System.identityHashCode(obj) : obj의 찐 해시값 반환
		System.out.println(System.identityHashCode(cpyStudent));
	}
}
