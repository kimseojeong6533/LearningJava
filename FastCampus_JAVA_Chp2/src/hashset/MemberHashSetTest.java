package hashset;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		
		// HashSet : python�� Set�ڷ����� ����ϰ� ����(���� ����) ��, �ڷ� �ߺ�X ��Ȳ���� ���.  ����, print�� �Է¼����� ��¼����� �ٸ� �� �ִ�.
		MemberHashSet memberHashset = new MemberHashSet();
		
		Member m1 = new Member(1,"Kim");
		Member m2 = new Member(2,"Shin");
		Member m3 = new Member(3,"Park");
		Member m4 = new Member(3,"You");
		Member m5 = new Member(3,"Park");
		
		memberHashset.addMember(m1);
		memberHashset.addMember(m2);
		memberHashset.addMember(m3);
		memberHashset.addMember(m4);
		memberHashset.addMember(m5);
		
		memberHashset.showAllMember();  
		
			
		
		
	}

}
