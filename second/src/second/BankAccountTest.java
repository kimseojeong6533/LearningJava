package second;
import second.BankAccountconsructor.*;
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccountconsructor kim = new BankAccountconsructor("16-66-66", "960229-9090990", 10000);
		kim.deposit(10000);
		kim.withdraw(5000);
		kim.checkMyBalance();
		
	}

}
