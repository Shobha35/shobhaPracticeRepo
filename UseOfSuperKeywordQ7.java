package JavaProgramAssignment;


class Person 
{
	Person()
	{
		System.out.println("Person Created");
	}
}

class Student extends Person
{
	Student()
	{
		super();
		System.out.println("Student Created");
	}
}

public class UseOfSuperKeywordQ7 
{
	public static void main(String[] args)
	{
		new Student();
	}

}
