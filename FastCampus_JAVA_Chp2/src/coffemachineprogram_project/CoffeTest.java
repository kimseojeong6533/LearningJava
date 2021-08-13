package coffemachineprogram_project;

public class CoffeTest {

	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();
		System.out.println();
		
		Coffee etiopiamocha = new Mocha(etiopiaCoffee);
		etiopiamocha.brewing();
		System.out.println();
		
		
		Coffee kenyaCoffee = new KenyaAmericano();
		Coffee kenyaLatte = new Latte(kenyaCoffee);
		kenyaLatte.brewing();
		System.out.println();
		
		
		Coffee kenyawhippingcream = new WhippingCream(new KenyaAmericano());
		kenyawhippingcream.brewing();
		System.out.println();
	}

}
