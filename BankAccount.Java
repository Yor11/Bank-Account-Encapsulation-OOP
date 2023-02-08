  
public class BankAccount {
	
	private String accountName;
    private int accountNumber;
    private double Balance;

    public BankAccount(String accountName, 
    		int accountNumber) {
   
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    // Getter
    public double getBalance() {
        return this.Balance;
    }

    // Setter
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void showDetails() {
 			System.out.println("ACCOUNT DETAILS:");
 			System.out.println("Account Name: "+ this.accountName);
 			System.out.println("Account Number: "+ this.accountNumber);
    }
}
