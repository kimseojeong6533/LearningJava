package listinterface_use;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;  // <Member> : MemberŬ���� ������ ������ arrayList�� ����
	
	public MemberArrayList() {
		arrayList = new ArrayList();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList(size);
	}
	
	public void addMember(Member m) {  // ��� Ŭ���� ������ �߰� 
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
		System.out.println("MemberId�� �ش��ϴ� ��Ұ� �����ϴ�");
		return false;
	}
	
	//Iterator�� �̿��ؼ� removeMember�Լ� �����
	public boolean removeMember_iterator(int memberId) {
		
		Iterator <Member> ir = arrayList.iterator();    // ir�� arrayList�� �ε��� 
		
		while(ir.hasNext()) {    // arrayList�� ��Ұ� �����ϸ� -> ir.hasNext() = True
			Member member = ir.next();    // i = i+1 �� ����
			if(member.getMemberId()==memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println("memberId�� �ش��ϴ� Member�� �����ϴ�");
		return false;
	}
	
	public void showAllMember() {
		for(Member m: arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}
	

}
