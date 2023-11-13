import java.util.Scanner;
class Bank_Account
{
	private double balance;
	public Bank_Account(double Initial_balance) {
		this.balance=Initial_balance;
	}
	public double getbalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Amount Deposited.Current Balance:" + balance );
		}
		else {
			System.out.println("Invalid Amount!");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("Amount Withdrawn.Current Balance:" + balance);
		}
		else {
			System.out.println("Insufficient Account Balance!");
		}
	}
}

class Atm
{
		private Bank_Account user;
		public Atm(Bank_Account Account) {
			this.user=Account;
		}
		public void Menu() {
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
		}
		public void handleInput() {
			Scanner sc=new Scanner(System.in);
			int choice;
			
			do {
				Menu();
				System.out.println("Enter your choice:");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Current Balance:" + user.getbalance());
					break;
				case 2:
					System.out.println("Enter the amount to deposit:");
					double DepoAmount=sc.nextDouble();
					user.deposit(DepoAmount);
					break;
				case 3:
					System.out.println("Enter the amount to withdraw:");
					double WithdrawAmount=sc.nextDouble();
					user.withdraw(WithdrawAmount);
					break;
				case 4:
					System.out.println("Exiting ATM interface,Thank You!");
					break;
				default:
					System.out.println("Invalid Option!");
				}
			}while(choice!=4);
		}
}

public class Services{
	public static void main(String[] args) {
		Bank_Account user=new Bank_Account(1000);
		Atm atm=new Atm(user);
		atm.handleInput();
	}
}
