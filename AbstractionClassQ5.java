package JavaProgramAssignment;


abstract class Animal 
{
	abstract void sound();
}

class Dog extends Animal 
{
	void sound() 
	{
		System.out.println("Barking");
	}
}

class Cat extends Animal 
{	
	void sound()
	{
		System.out.println("Meow");
	}
}


public class AbstractionClassQ5 {
	
	public static void main(String[] args)
	{
		Dog g = new Dog();
		g.sound();
		Cat c = new Cat();
		c.sound();
		
	}

}
