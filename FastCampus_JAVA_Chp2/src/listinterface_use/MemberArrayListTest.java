package listinterface_use;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member m1 = new Member(1,"Kim");
		Member m2 = new Member(2,"Shin");
		Member m3 = new Member(3,"Park");
		Member m4 = new Member(4,"Lee");
		
		
		memberArrayList.addMember(m1);
		memberArrayList.addMember(m2);
		memberArrayList.addMember(m3);
		memberArrayList.addMember(m4);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(m1.getMemberId());    			// remove(Object)
		memberArrayList.removeMember_iterator(m3.getMemberId());  // remove with Iterator
		memberArrayList.showAllMember();
		
		
	}

}
