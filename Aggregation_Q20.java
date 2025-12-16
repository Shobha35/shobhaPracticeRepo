package JavaProgramAssignment;


class Engine
{
	String name;
	int hp;
	
	Engine(String n, int h)
	{
		this.name = n;
		this.hp = h;
	}
	
	void engineInfo()
	{
		System.out.println("Car Name: " +name+ "\nHorse Power :" +hp);
	}
}

class Car {
	String model;
	Engine engineRef; // Aggregation Car HAS-A Engine
	
	Car(String model, Engine engineRef) {
        this.model = model;
        this.engineRef = engineRef;
    }
	
	void showCarInfo()
	{
		System.out.println("Car Model :" +model);
		engineRef.engineInfo();
	}
}

public class Aggregation_Q20 {
	
	public static void main(String[] args)
	{
		Engine e = new Engine("BMW",450);
		Car c = new Car("XYZ",e);
		c.showCarInfo();
	}
}
