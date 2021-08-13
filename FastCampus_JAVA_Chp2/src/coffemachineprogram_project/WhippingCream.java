package coffemachineprogram_project;

public class WhippingCream extends Decorator{

	public WhippingCream(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.println("Adding Whipping Cream");
		
	}
	
	

}
