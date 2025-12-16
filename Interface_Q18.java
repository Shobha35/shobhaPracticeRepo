package JavaProgramAssignment;

interface Transport 
{
	void booking();
}

class Bus implements Transport
{
	public void booking()
	{
		System.out.println("Bus Booking Details");
		System.out.println("Seat Reserved");
		System.out.println("Boarding Point: SBI Bank");
		System.out.println("Ticket Type : A/C Sleeper");
	}
}

class Flight implements Transport
{
	public void booking()
	{
		System.out.println("Flight Booking Details");
		System.out.println("Seat Allocated");
		System.out.println("Boarding Gate: E12");
		System.out.println("Class : Economy");
	}
}

public class Interface_Q18 {
	
	public static void main(String[] args)
	{
		Transport ts;
		ts = new Bus();
		ts.booking();
		System.out.println();
		ts = new Flight();
		ts.booking();
	}
}
