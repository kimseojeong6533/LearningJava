package coffemachineprogram_project;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
		
	}
	@Override
	public void brewing() {
		super.brewing();
		System.out.print("Adding milk");
		
	}
	
}
