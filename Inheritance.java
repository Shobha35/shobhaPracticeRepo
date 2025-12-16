package JavaProgramAssignment;

class Vehicle 
{
     void fuelType() 
     {
        System.out.println("Runs on fuel");
    }
}

class ElectricCar extends Vehicle 
{
    
     void fuelType() 
     {
        System.out.println("Runs on electricity");
    }
}

public class Inheritance 
{

    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        v.fuelType(); 
        System.out.println();
        ElectricCar ec = new ElectricCar();
        ec.fuelType(); 
    }
}
