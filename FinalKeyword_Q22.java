package JavaProgramAssignment;

class GovernmentRules 
{
	final int MAX_WORKING_HOURS = 8;
	
	void display()
	{
		System.out.println("Standard working hours :" +MAX_WORKING_HOURS);
	}
}

public class FinalKeyword_Q22 {

	public static void main(String[] args)
	{
		GovernmentRules g = new GovernmentRules();
		g.display();
		
		//Try to change final value
		//If uncomment below line will get compile-time restriction
		//g.MAX_WORKING_HOURS = 12;
	}
}
