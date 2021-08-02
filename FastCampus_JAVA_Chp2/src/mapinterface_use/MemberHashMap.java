package mapinterface_use;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {
	
	/**
	 HashMap : <Key : Value>  
	  �� ��, Key�� �ߺ�X (Set����), Value�� Collection����(�ߺ�����)
	  
	 */
	
	private HashMap <Integer, Member> hashMap;  
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);  // put �Ű����� : (key, value)
	}
	
	public void removeMember(int memberId) {
		if (hashMap.containsKey(memberId)){
			hashMap.remove(memberId);
			return;
		}
		else {
			System.out.println("NO ELEMENT");
			return;
		}	
	}
	
	public void showAllMember() {
		Iterator <Integer> ir = hashMap.keySet().iterator();  //Ű���� ���� iterator �ν��Ͻ� ����
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);  // get(key) -> value(Member ��)�� ��ȯ
			System.out.println(member);
		}
	}
	
	
}
