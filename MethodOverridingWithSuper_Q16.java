package JavaProgramAssignment;

class Hospital
{
	void emergencyService()
	{
		 System.out.println("Hospital Emergency Services:");
		 System.out.println("1. 24x7 Emergency Ward");
		 System.out.println("2. Ambulance Service");
	}
}

class CityHospital extends Hospital
{
	void emergencyService()
	{
		super.emergencyService();
		System.out.println("City Hospital Emergency Services:");
		System.out.println("1. ICU & Critical Care");
	    System.out.println("2. Trauma Care Unit");
	    System.out.println("3. Emergency Helpline: 108");
	}
}

public class MethodOverridingWithSuper_Q16 {
	
	public static void main(String[] args)
	{
		CityHospital ch = new CityHospital();
		ch.emergencyService();
	}
}
