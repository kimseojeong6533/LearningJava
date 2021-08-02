package hashset;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet <Member> hashSet;  // <Member> : Member클래스 변수로 구성된 arrayList를 생성
	
	public MemberHashSet() {
		hashSet = new HashSet();
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet(size);
	}
	
	public void addMember(Member m) {  // 멤버 클래스 변수를 추가 
		hashSet.add(m);
	}
	
	//hashSet은 get함수가 없으므로, Iterator를 이용해서 자료를 Delete할 removeMember함수를 만듦.
	public boolean removeMember_iterator(int memberId) {
		
		Iterator <Member> ir = hashSet.iterator();    // ir은 arrayList의 인덱스 
		
		while(ir.hasNext()) {    					// arrayList에 요소가 존재하면 -> ir.hasNext() = True
			Member member = ir.next();     // i = i+1 과 동일
			if(member.getMemberId()==memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("memberId에 해당하는 Member가 없습니다");
		return false;
	}
	
	public void showAllMember() {
		for(Member m: hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	

}
