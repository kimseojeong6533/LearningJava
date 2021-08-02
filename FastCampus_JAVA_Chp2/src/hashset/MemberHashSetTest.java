package hashset;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		
		// HashSet : python의 Set자료형과 비슷하게 사용됨(집합 개념) 즉, 자료 중복X 상황에서 사용.  또한, print시 입력순서와 출력순서가 다를 수 있다.
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
