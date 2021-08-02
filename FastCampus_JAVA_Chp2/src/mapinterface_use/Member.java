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
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	/**
	 * HashSet사용시, hashCode, equals 를 재정의해서 같은 자료형의 기준을 만들 수 있다.
	 
	 * hashCode() : 두객체가 같은 객체인지 확인하는 메서드
	 * equals() : 두 객체의 내용이 같은지 확인하는 메서드
	 
	 HashTable은 <key,value> 형태로 데이터를 저장한다. 이 때 해시 함수(Hash Function)을 이용하여 key값을 기준으로 고유한 식별값인 
	 해시값을 만든다. (hashcode가 해시값을 만드는 역할을 한다.) 이 해시값을 버킷(Bucket)에 저장한다. but, Hashtable 크기는 한정적이기 때문에
	 서로 다른 객체이더라도 같은 해시값을 갖게 될 수 있다.(=해시 충돌)
	 이때, 같은 해시값의 버킷 안에 다른 객체가 있는 경우 equals 메서드가 사용된
	*/
	
	@Override
	public int hashCode() {   // 해시값을 memberId를 기준으로 만든다고 재정의
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;  //this.memberId == member.getMemberId() && 
			if(this.memberId == member.getMemberId()) {   // memberId가 같으면 같은 내용이라고 정의 => hashSet에서 같은 memberId가 들어오면, 새로운 것은 추가되지 않음.
				return true;
			}
			else return false;
		}
		else return false; 
			
		
		
	}
	
	
}
