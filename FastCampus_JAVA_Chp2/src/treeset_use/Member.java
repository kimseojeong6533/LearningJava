package treeset_use;

import java.util.Comparator;

public class Member implements Comparator <Member> {
	
	private int memberId;
	private String memberName;
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}

	/**
	 * HashSet����, hashCode, equals �� �������ؼ� ���� �ڷ����� ������ ���� �� �ִ�.
	 
	 * hashCode() : �ΰ�ü�� ���� ��ü���� Ȯ���ϴ� �޼���
	 * equals() : �� ��ü�� ������ ������ Ȯ���ϴ� �޼���
	 
	 HashTable�� <key,value> ���·� �����͸� �����Ѵ�. �� �� �ؽ� �Լ�(Hash Function)�� �̿��Ͽ� key���� �������� ������ �ĺ����� 
	 �ؽð��� �����. (hashcode�� �ؽð��� ����� ������ �Ѵ�.) �� �ؽð��� ��Ŷ(Bucket)�� �����Ѵ�. but, Hashtable ũ��� �������̱� ������
	 ���� �ٸ� ��ü�̴��� ���� �ؽð��� ���� �� �� �ִ�.(=�ؽ� �浹)
	 �̶�, ���� �ؽð��� ��Ŷ �ȿ� �ٸ� ��ü�� �ִ� ��� equals �޼��尡 ����
	*/
	
	@Override
	public int hashCode() {   // �ؽð��� memberId�� �������� ����ٰ� ������
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;  //this.memberId == member.getMemberId() && 
			if(this.memberId == member.getMemberId()) {   // memberId�� ������ ���� �����̶�� ���� => hashSet���� ���� memberId�� ������, ���ο� ���� �߰����� ����.
				return true;
			}
			else return false;
		}
		else return false; 
			
		
		
	}

	@Override
	public int compare(Member o1, Member o2) {		
		return (o1.memberId - o2.memberId);
	}
			
		
	
// Comparable �������̽� ������,
//	@Override
//	public int compareTo(Member member) {
//		
//		// ����Ž��Ʈ�� -> ����� ��, ������������ ��µ�
//		if(this.memberId > member.memberId) {
//			return 1; 
//		}
//		else if(this.memberId < member.memberId) {
//			return -1;
//		}
//		else return 0;
//
//	}

	
}
