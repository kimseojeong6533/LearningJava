package listinterface_use;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;  // <Member> : Member클래스 변수로 구성된 arrayList를 생성
	
	public MemberArrayList() {
		arrayList = new ArrayList();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList(size);
	}
	
	public void addMember(Member m) {  // 멤버 클래스 변수를 추가 
		arrayList.add(m);
	}
	
	public boolean removeMember(int memberId) {
		
		for(int i = 0;i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println("MemberId에 해당하는 요소가 없습니다");
		return false;
	}
	
	//Iterator를 이용해서 removeMember함수 만들기
	public boolean removeMember_iterator(int memberId) {
		
		Iterator <Member> ir = arrayList.iterator();    // ir은 arrayList의 인덱스 
		
		while(ir.hasNext()) {    // arrayList에 요소가 존재하면 -> ir.hasNext() = True
			Member member = ir.next();    // i = i+1 과 동일
			if(member.getMemberId()==memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println("memberId에 해당하는 Member가 없습니다");
		return false;
	}
	
	public void showAllMember() {
		for(Member m: arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}
	

}
