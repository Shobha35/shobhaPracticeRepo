package JavaProgramAssignment;

class Course 
{
	void courseInfo()
	{
		System.out.println("All courses are registered under University");
	}
}

class Science extends Course
{
	void scienceSub()
	{
		System.out.println("Science subjects : Pysics, Maths, Biology Chemestry");
	}
}

class Arts extends Course
{
	void artsSub()
	{
		System.out.println("Arts subjects : Literature, History, Sociology, Homescience");
	}
}

class Commerce extends Course
{
	void commerceSub()
	{
		System.out.println("Commerce subjects : Economics, Accounts, Business Studies");
	}
}

public class HirarchicalInheritence_Q14 {

	public static void main(String[] args)
	{
		Science sc = new Science();
		sc.courseInfo();
		sc.scienceSub();
		System.out.println();
		
		Commerce cm = new Commerce();
		cm.courseInfo();
		cm.commerceSub();
		
		System.out.println();
		Arts ar = new Arts();
		ar.courseInfo();
		ar.artsSub();
	}
}
