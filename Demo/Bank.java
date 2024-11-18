package Demo;

public class Bank {

	private String AccountNumber;
	String Name;
	private double balance;
	
	

	public double getbalance() {
		return balance;
	}

	 public void setbalance(double balance1) {
		balance = balance1;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String AC) {

		AccountNumber= AC;
	}

	void display() {
		
		System.out.println("Accountnumber: " + AccountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Name: " + Name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank1 = new Bank();
		bank1.Name = "Ray Bank";
		bank1.balance = 10000000;
		bank1.AccountNumber = "234569887456";
		bank1.display();

	}

}
