package JavaProgramAssignment;

class University
{
	static String country = "India";
	String universityName;
	
	University(String name)
	{
		this.universityName = name;
	}
	
	void display()
	{
		System.out.println("University :" +universityName+   "  Country :" +country);
	}
}

public class StaticConcepts_Q21 {
	
	public static void main(String[] args)
	{
		University u1 = new University("KLE");
		u1.display();
		University u2 = new University("IIT Bombay");
		u2.display();
		University u3 = new University("Dharwad University");
		u3.display();
		System.out.println();
		//Change static value
		University.country = "Bharat";
		u1.display();
		u2.display();
		u3.display();
	}

}
