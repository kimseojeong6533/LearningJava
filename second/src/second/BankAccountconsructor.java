package second;

public class BankAccountconsructor{
	String accNumber;
	String ssNumber;
	int balance;
	
	public BankAccountconsructor(String acc, String ss, int bal) {  // ������
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("���¹�ȣ : "+ accNumber);
		System.out.println("�ֹι�ȣ : "+ ssNumber);
		System.out.println("�ܾ� : "+ balance + '\n');
		return balance;
		
	}
		
		
	public static void main(String[] args) {
		BankAccountconsructor yoon = new BankAccountconsructor("12-34-89", "990990-9090990", 10000);
		BankAccountconsructor park= new BankAccountconsructor("33-55-09", "770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
	
}
	
