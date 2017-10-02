package Core_Java_Assignment3;

public class Employee {


  
     String empName;
     int empSalary;
     String empAddress;

    //default constructor of the class
    public Employee()
    {
    	//this will call the constructor with String param
        this("Prabin");
    }

    public Employee(String name)
    {
    	//call the constructor with (String, int) param
    	this(name, 1150000);
    }
    public Employee(String name, int sal)
    {
    	//call the constructor with (String, int, String) param
    	this(name, sal, "Gurgaon");
    }
    public Employee(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.empAddress=addr;
    }

    void disp() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+empAddress);
    }
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.disp();
    }
}