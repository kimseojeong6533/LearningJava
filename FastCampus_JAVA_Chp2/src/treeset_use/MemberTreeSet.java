package treeset_use;

import java.util.Iterator;
import java.util.TreeSet;

/**
	TreeSet : ��ü�� ���Ŀ� ����ϴ� Ŭ����
		- Set �������̽��� �����Ͽ� �ߺ��� ������� �ʰ�, ���������̳� ������������ ��ü�� ������ �� ����
		- ���������� �����˻�Ʈ��(binary search tree)�� ������
		- �����˻�Ʈ���� �����ϱ� ���� �� ��ü�� ���ؾ� ��
		- �� ����� �Ǵ� ��ü�� Comparable�̳� Comparator �������̽��� ���� �ؾ� TreeSet�� �߰� �� �� ����
		- String, Integer�� JDK�� ���� Ŭ�������� �̹� Comparable�� ��������
	
 */


public class MemberTreeSet {
	
	private TreeSet <Member> treeSet;  // <Member> : MemberŬ���� ������ ������ arrayList�� ����
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member m) {  // ��� Ŭ���� ������ �߰� 
		treeSet.add(m);
	}
	
	public boolean removeMember_iterator(int memberId) {
		
		Iterator <Member> ir = treeSet.iterator();    // ir�� arrayList�� �ε��� 
		
		while(ir.hasNext()) {    					// arrayList�� ��Ұ� �����ϸ� -> ir.hasNext() = True
			Member member = ir.next();     // i = i+1 �� ����
			if(member.getMemberId()==memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("memberId�� �ش��ϴ� Member�� �����ϴ�");
		return false;
	}
	
	public void showAllMember() {
		for(Member m: treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	

}
