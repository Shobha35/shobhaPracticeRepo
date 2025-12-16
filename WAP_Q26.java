package JavaProgramAssignment;

class School26
{
	String name;
	String address;
	int strenth;
	
	School26(String n, String a)
	{
		this.name = n;
		this.address = a;
		this.strenth = 0;
	}
	
	School26(String n, String a, int s)
	{
		this.name = n;
		this.address = a;
		this.strenth = s;
	}
	
	void display()
	{
		System.out.println("Name of School: " +name);
		System.out.println("Address : " +address);
		System.out.println("Strenth : " +strenth);
	}
}

public class WAP_Q26 {

	public static void main(String[] args)
	{
		School26 s1 = new School26("Divine Life","Ahmedabad");
		s1.display();
		System.out.println();
		School26 s2 = new School26("Gurukulam","Gandhinagar",1500);
		s2.display();	
	}
}
