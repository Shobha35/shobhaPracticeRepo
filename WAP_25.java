package JavaProgramAssignment;

class School
{
	String name = "Divine Life";
	
	School()
	{
		System.out.println("Name of the School : " +name);
	}
	
	void display()
	{
		System.out.println("This School is based out of Kolkata");
	}
}

public class WAP_25 {
	public static void main(String[] args)
	{
		School s = new School();
		s.display();
	}
}
