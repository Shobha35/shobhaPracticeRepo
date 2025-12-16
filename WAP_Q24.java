package JavaProgramAssignment;

class Shape24
{
	int length = 10;
	
	void square()
	{
		int area;
		area = this.length * this.length;
		System.out.println("Area of Square :" +area);
	}
	
	void rectangle(double w)
	{
		double area;
		area = this.length * w;
		System.out.println("Area of Rectangle :" +area);
	}
	
	void circle()
	{
		double area;
		area = 3.14 * this.length * this.length;
		System.out.println("Area of Circle : " +area);
	}
}

public class WAP_Q24 {
	
	public static void main(String[] args)
	{
		Shape24 s = new Shape24();
		s.square();
		s.rectangle(5.0);
		s.circle();
	}
}
