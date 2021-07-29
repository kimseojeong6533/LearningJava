package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(1,"kimchulsu",3);
		Student kim2 = new Student();
		System.out.println(kim.showStudentInfo());
		System.out.println(kim2.showStudentInfo());
	}

}
