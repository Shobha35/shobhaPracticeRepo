package JavaProgramAssignment;

class Account
{
	private String accountHolderName;
	private double balance;
	
	public String getaccountHolderName()
	{
		return accountHolderName;
	}
	
	public void setaccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		if (balance < 0) 
		{
			System.out.println("Warning: Balance cannot be negative! Value rejected.");
		}
		else
		{
			this.balance = balance;
			System.out.println("Name :" +accountHolderName);
			System.out.println("Balance :" +balance);
		}
	}
}

public class EncapsulationValidation_12 {
	
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.getaccountHolderName();
		a1.setaccountHolderName("Tarun");
		a1.getBalance();
		a1.setBalance(25000);
		
		//Set -ve value 
		Account a2 = new Account();
		a2.getaccountHolderName();
		a2.setaccountHolderName("Manu");
		a2.getBalance();
		a2.setBalance(-5);
	}

}
