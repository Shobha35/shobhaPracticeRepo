package JavaProgramAssignment;

class Camera
{
	void capture()
	{
		System.out.println("Camera: Capture a basic photos.");
	}
}

class DSLCamera extends Camera
{
	void capture()
	{
		System.out.println("DSLCamera : Capture a high resolution photos.");
	}
}

public class Polymorphism_Q19 {
	
	public static void main(String[] args)
	{
		Camera c = new DSLCamera(); //Upcasting
		c.capture();
	}
}
