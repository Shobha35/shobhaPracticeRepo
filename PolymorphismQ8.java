package JavaProgramAssignment;

class Shape
{
	double area(double x, double y)
	{
		return 0;
	}	
}

class Rectangle extends Shape
{
	
	double area(double x, double y)
	{
		return x * y;
	}
}

class Circle extends Shape 
{
	double pi = 3.14;
	double area(double x, double y)
	{
		return pi*x*y;
	}
}

public class PolymorphismQ8 
{
	public static void main(String[] args)
	{

		Shape s1;
		s1 = new Rectangle();
		System.out.println("Are of Rectangle: "  + s1.area(10.0, 5.0));
		
		s1 = new Circle();
		System.out.println("Are of Circle: "  + s1.area(5.0, 5.0));
		
	}
}
