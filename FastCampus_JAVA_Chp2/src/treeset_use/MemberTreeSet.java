package treeset_use;

import java.util.Iterator;
import java.util.TreeSet;

/**
	TreeSet : 객체의 정렬에 사용하는 클래스
		- Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있음
		- 내부적으로 이진검색트리(binary search tree)로 구현됨
		- 이진검색트리에 저장하기 위해 각 객체를 비교해야 함
		- 비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet에 추가 될 수 있음
		- String, Integer등 JDK의 많은 클래스들이 이미 Comparable을 구현했음
	
 */


public class MemberTreeSet {
	
	private TreeSet <Member> treeSet;  // <Member> : Member클래스 변수로 구성된 arrayList를 생성
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member m) {  // 멤버 클래스 변수를 추가 
		treeSet.add(m);
	}
	
	public boolean removeMember_iterator(int memberId) {
		
		Iterator <Member> ir = treeSet.iterator();    // ir은 arrayList의 인덱스 
		
		while(ir.hasNext()) {    					// arrayList에 요소가 존재하면 -> ir.hasNext() = True
			Member member = ir.next();     // i = i+1 과 동일
			if(member.getMemberId()==memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("memberId에 해당하는 Member가 없습니다");
		return false;
	}
	
	public void showAllMember() {
		for(Member m: treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	

}
