package JavaProgramAssignment;

class Mall 
{
	Mall()
	{
		System.out.println("Welcome to the Mall");
	}
	
	Mall(String name)
	{
		this(); // Calling Default constructor
		System.out.println("This is a" +name+ " Mall Located in Ahmedabad");
	}
}

public class ConstructorChaining_Q23 {
	
	public static void main(String[] agrs)
	{
		new Mall("Alpha One");
	}
}
