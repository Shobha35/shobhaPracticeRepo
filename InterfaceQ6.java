package JavaProgramAssignment;


interface Payment 
{	
	void makePayment();
}

class UPI implements Payment
{
	public void makePayment()
	{
		System.out.println("Payment done by UPI");
	}
}

class CreditCard implements Payment
{
	public void makePayment()
	{
		System.out.println("Payment done by Credit Card");
	}
}

public class InterfaceQ6 
{
	public static void main(String[] args)
	{
		Payment p = new UPI();
		p.makePayment();
		
		Payment p2 = new CreditCard();
		p2.makePayment();
		
	}
}
