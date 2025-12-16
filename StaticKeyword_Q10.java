package JavaProgramAssignment;

class Students
{
	static String collegeName = "ABC";
	String name;
	int rollNo;
	
	void display(String n, int r)
	{
		name = n;
		rollNo = r;
		
		 System.out.println("\nCollege Name: " + collegeName +
                 "\nName of the Student: " + name +
                 "\nRoll No: " + rollNo);
	}
}

public class StaticKeyword_Q10 {
	public static void main(String[] args)
	{
		Students s = new Students();
		s.display("Samu", 1011);
		s.display("Ammu", 1012);
		s.display("Tarun", 1013);
		s.display("Virat", 1014);
	}

}
