package second;

public class StringEquality {

	public static void main(String[] args) {
		
		String str1 = new String("Simple");
		String str2 = new String("Simple");
		String str3 = "Dimple";
		String str4 = "Simple";
		
		
		if(str1 == str2) {
			System.out.println("참조대상이 동일");
		}
		
		if(str3 == str4) {
			System.out.println("참조대상이 동일합니다");
		}
		else
			System.out.println("참조대상이 다릅니다");
		
		if(str1 == str4) {
			System.out.println("참조대상이 동일합니다");
		}
		else
			System.out.println("참조대상이 다릅니다");

	}

}
