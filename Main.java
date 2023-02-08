import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
		
			System.out.println("**WELCOME TO MAHARLIKA ATM BANK**");
        	System.out.print("\nENTER YOUR ACCOUNT INFORMATION:\n");

			System.out.print("Account Name: ");
			String accountName = br.readLine();
			
			System.out.print("Account Number: ");
			
            int accountNumber = Integer.parseInt(br.readLine());
            System.out.println("-----------------");

			BankAccount objBankAcc = new BankAccount(accountName, accountNumber);
			objBankAcc.showDetails();

			do {
				// Transaction 
				System.out.println("\nCHOOSE TRANSACTIONS");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Exit");
				System.out.print("Selection: ");

				BankAccount deposit = new BankAccount(accountName, accountNumber);
				double balance = deposit.getBalance();

				int option = Integer.parseInt(br.readLine());

				// Deposit 
				if (option == 1) {
					
			    System.out.print("\nENTER AMOUNT TO DEPOSIT:");
				double depOpt = Double.parseDouble(br.readLine());

		   if (depOpt > 0) {

						balance =+ depOpt;
						deposit.setBalance(balance);
						
						System.out.println("Successfully deposited: " + depOpt);
						System.out.println("Your balance: " + balance);
					}
					
					else {
						System.out.println("Invalid Number!");
					}
				}

				// Withdraw 
				if (option == 2) {
					System.out.print("\nENTER AMOUNT TO WITHDRAW: ");
					double withOpt = Double.parseDouble(br.readLine());

					if (withOpt > 0) {
						
						balance =- withOpt;
						deposit.setBalance(balance);
						
						System.out.println("Successfully withdrawed: " + withOpt);
						System.out.println("Your balance: " + balance);

					}

					else {
						System.out.println("Insuffiecent Funds!");

					}
				}

				// Exit 
				if (option == 3) {
					System.out.print("\nTHANK YOU!");
					System.exit(0);
				}
			} while (true);

	}
}	