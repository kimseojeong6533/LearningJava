package second;

public class BuilderString_Exercise {

		public static void main(String[] args) {
			StringBuilder str = new StringBuilder("990925-1012999");
			str.replace(6, 7, " ").toString();
			System.out.println(str);
		}
}
