package mapinterface_use;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		// HashSet : python�� Set�ڷ����� ����ϰ� ����(���� ����) ��, �ڷ� �ߺ�X ��Ȳ���� ���.  ����, print�� �Է¼����� ��¼����� �ٸ� �� �ִ�.
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
		
		System.out.println(hashMap);  // key = value ������ ��µ�. �̶�, value�� toString()�Լ� ���ϰ����� ��� 
		
	}

}
