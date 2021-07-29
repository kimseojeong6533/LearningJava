package Array;

/**
 입력한 학생의 과목이름과 성적을 출력하는 프로그램 만들기
 */

public class ArrayStudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();   
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}
}

