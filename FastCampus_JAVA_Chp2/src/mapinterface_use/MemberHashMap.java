package mapinterface_use;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {
	
	/**
	 HashMap : <Key : Value>  
	  이 때, Key는 중복X (Set개념), Value는 Collection개념(중복가능)
	  
	 */
	
	private HashMap <Integer, Member> hashMap;  
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);  // put 매개변수 : (key, value)
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
		Iterator <Integer> ir = hashMap.keySet().iterator();  //키값에 대한 iterator 인스턴스 생성
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);  // get(key) -> value(Member 형)가 반환
			System.out.println(member);
		}
	}
	
	
}
