package JavaProgramAssignment;

abstract class EmployeeType //Employee class is already created in previous program
{
	String empName;
	int empID;
	
	
	abstract void calculateSalary();
	
	EmployeeType(String n, int id)
	{
		this.empName = n;
		this.empID = id;
	}
	
	void employeeDetails()
	{
		System.out.println("Name :"+empName+ "\nID: "+empID);
	}
}

class FullTimeEmployee extends EmployeeType
{
	double monthSalary;
	
	FullTimeEmployee(String name, int id, double salary)
	{
		super(name,id);
		this.monthSalary = salary;
	}
	
	void calculateSalary()
	{
		System.out.println("Employee Type : Full Time");
		System.out.println("Salara : Monthly Fixed Pay");
		System.out.println("Total Salary : $" +monthSalary);
	}
}


class PartTimeEmployee extends EmployeeType
{
	double hourRate;
	double workedHour;
	double total;
	
	PartTimeEmployee(String name, int id, double hourRate, double workedHour)
	{
		super(name,id);
		this.hourRate = hourRate;
		this.workedHour = workedHour;
	}
	void calculateSalary()
	{
		total = hourRate * workedHour;
		
		System.out.println("Employee Type : Part Time");
		System.out.println("Salary : Hourly base");
		System.out.println("Total Salary :" +total);
	}
}



public class AbstractClassRealUse_16 {
	
	public static void main(String[] args)
	{
		FullTimeEmployee ft = new FullTimeEmployee("Tarun",101,75000);
		ft.employeeDetails();
		ft.calculateSalary();
		System.out.println();
		PartTimeEmployee pt = new PartTimeEmployee("Virat",102,2000,250);
		pt.employeeDetails();
		pt.calculateSalary();
	}
}
