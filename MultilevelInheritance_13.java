package JavaProgramAssignment;

class Device
{
	void start()
	{
		System.out.println("This is from Device class");
	}
}

class Mobile extends Device
{
	void calling()
	{
		System.out.println("This is from Mobile class");
	}
}

class SmartPhone extends Mobile
{
	void internet()
	{
		System.out.println("This is from SmartPhone class");
	}
}

public class MultilevelInheritance_13 
{
	public static void main(String[] args)
	{
		SmartPhone sp = new SmartPhone();
		sp.start();
		sp.calling();
		sp.internet();
	}
}
