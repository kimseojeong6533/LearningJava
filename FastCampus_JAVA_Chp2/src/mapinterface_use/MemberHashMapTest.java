package mapinterface_use;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		// HashSet : python의 Set자료형과 비슷하게 사용됨(집합 개념) 즉, 자료 중복X 상황에서 사용.  또한, print시 입력순서와 출력순서가 다를 수 있다.
		MemberHashMap memberHashmap = new MemberHashMap();
		
		Member m1 = new Member(1,"Kim");
		Member m2 = new Member(2,"Shin");
		Member m3 = new Member(3,"Park");
		Member m4 = new Member(3,"You");
		Member m5 = new Member(3,"Park");
		
		memberHashmap.addMember(m1);
		memberHashmap.addMember(m2);
		memberHashmap.addMember(m3);
		memberHashmap.addMember(m4);
		memberHashmap.addMember(m5);
		
		memberHashmap.showAllMember();  
		
			
		HashMap<Integer, Member> hashMap = new HashMap<Integer, Member>();
		hashMap.put(1001, m1);
		hashMap.put(1002, m2);
		hashMap.put(1003, m3);
		
		System.out.println(hashMap);  // key = value 쌍으로 출력됨. 이때, value는 toString()함수 리턴값으로 출력 
		
	}

}
