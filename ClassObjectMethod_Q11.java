package JavaProgramAssignment;

class Library
{
	String libraryName = "City Central Library";
	
	Library()
	{
		System.out.println("Welcome to the Library");
	}
	
	void showLocation()
	{
		System.out.println("This library is located in Mumbai");
	}
}

public class ClassObjectMethod_Q11 {

	public static void main(String[] args) {
		Library l = new Library();
		l.showLocation();
		System.out.println("The Name of the Library is: " +l.libraryName);
	}
}
