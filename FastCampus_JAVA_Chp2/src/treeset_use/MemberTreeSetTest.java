package treeset_use;

import java.util.Comparator;
import java.util.TreeSet;


class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*(-1);   //default
		
	}
	
}

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		
		MemberTreeSet memberTreeset = new MemberTreeSet();   // TreeSet을 이용하려면, Comparable 인터페이스를 구현해야함.
		
		Member m1 = new Member(4,"Kim");
		Member m2 = new Member(2,"Shin");
		Member m3 = new Member(3,"Park");
		Member m4 = new Member(1,"You");

		
		memberTreeset.addMember(m1);
		memberTreeset.addMember(m2);
		memberTreeset.addMember(m3);
		memberTreeset.addMember(m4);

		
		memberTreeset.showAllMember();
		System.out.println();
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set);
		
		System.out.println();
		
		TreeSet <String> set2 = new TreeSet<String>(new MyCompare());  // 내가 따로 정렬에 대해서 정의한 MyCompare클래스 인스턴스를 명시해주어야 함.
		
		set2.add("Park");
		set2.add("Kim");
		set2.add("Lee");
		
		System.out.println(set2);
			
		
		
	}

}
