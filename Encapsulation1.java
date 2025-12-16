package JavaProgramAssignment; 

class Employee {
    private int empId;
    private String empName;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details");
        System.out.println("Emp ID: " + empId);
        System.out.println("Emp Name: " + empName);
        System.out.println("Emp Salary: " + salary);
    }
}

public class Encapsulation1 { 
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setEmpName("Samrat");
        emp.setSalary(75000.00);

        emp.displayDetails();
    }
}