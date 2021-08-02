package hashset;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet <Member> hashSet;  // <Member> : MemberŬ���� ������ ������ arrayList�� ����
	
	public MemberHashSet() {
		hashSet = new HashSet();
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet(size);
	}
	
	public void addMember(Member m) {  // ��� Ŭ���� ������ �߰� 
		hashSet.add(m);
	}
	
	//hashSet�� get�Լ��� �����Ƿ�, Iterator�� �̿��ؼ� �ڷḦ Delete�� removeMember�Լ��� ����.
	public boolean removeMember_iterator(int memberId) {
		
		Iterator <Member> ir = hashSet.iterator();    // ir�� arrayList�� �ε��� 
		
		while(ir.hasNext()) {    					// arrayList�� ��Ұ� �����ϸ� -> ir.hasNext() = True
			Member member = ir.next();     // i = i+1 �� ����
			if(member.getMemberId()==memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("memberId�� �ش��ϴ� Member�� �����ϴ�");
		return false;
	}
	
	public void showAllMember() {
		for(Member m: hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	

}
