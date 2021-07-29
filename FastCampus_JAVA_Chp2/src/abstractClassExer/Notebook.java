package abstractClassExer;

public abstract class Notebook extends Computer{  // typing()은 구현하지 않았으므로 abstract를 추가해줌.

	@Override
	public void display() {
		System.out.println("Notebook Displaying");
		
	}

}
