package mapinterface_use;

public class Member {
	
	private int memberId;
	private String memberName;
	
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
	
	
}
