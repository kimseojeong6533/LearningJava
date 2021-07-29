package Array;

import java.util.ArrayList;

class SubjectScore{
	private String subjectName;
	private int score;
	
	public SubjectScore(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}
	
	public String showInfo() {
		 return subjectName+" "+score;
	}
	
}

public class Student {
	
	
	
	// 과목에 대한 점수 배열 만들기
	ArrayList<SubjectScore> ss = new ArrayList<SubjectScore>(); 
	
	private int stuNum;
	private String stuName;
	private int totalScore=0;
	
	public Student(int stuNum, String stuName) {
		this.stuNum = stuNum;
		this.stuName = stuName;
	}
	
	public void addSubject(String subjectName, int score) {
		ss.add(new SubjectScore(subjectName, score));
		totalScore+=score;
	}
	
	public void showStudentInfo() {
		
		int total=0;
		for(int i=0;i<ss.size();i++) {
			System.out.printf("%d %s학생은 ", stuNum, stuName);
			System.out.print(ss.get(i).showInfo());
			System.out.println("입니다");
		}
		System.out.printf("총 %s점 입니다",totalScore);
		System.out.println();
		
	}
}
