package JavaProgramAssignment;

class LoanCalculator
{
	double rate = 10;
	double interest;
	
	void calculateLoan(int amount)
	{
		interest = rate * amount /100;
		System.out.println("Principle Amount: " +amount);
		System.out.println("Default Interest: " +rate+ "%");
		System.out.println("Calculated Interest: $"+interest);
	}
	
	void calculateLoan(int amount, double interestRate)
	{
		interest = interestRate * amount / 100;
		System.out.println("Principle Amount: "+amount);
		System.out.println("Rate of interest: "+interestRate+ "%");
		System.out.println("Calculated Interest: $"+interest);
	}
}

public class MethodOverloading_Q15 {
	
	public static void main(String[] args)
	{
		LoanCalculator lc = new LoanCalculator();
		lc.calculateLoan(10000);
		System.out.println();
		lc.calculateLoan(50000, 7.5);
	}
}
