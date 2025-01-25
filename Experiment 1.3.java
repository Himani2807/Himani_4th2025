Aim: Write a Java program to create an Employee class where an Overloaded constructor initializes employee details.The default constructor should Initialize name as "Unknown" and salary as 0 and the second constructor initializes the name and sets a default salary.  Create a method DisplayEmployeeDetails() to display employee information.
Code: 
class Employee {
    // Instance variables for employee name and salary
    private String name;
    private double salary;
    // Default constructor - initializes name as "Unknown" and salary as 0
    public Employee() {
        this.name = "Unknown";
        this.salary = 0;
    }
    // Overloaded constructor - initializes name and sets a default salary
    public Employee(String name) {
        this.name = name;
        this.salary = 5000; // Default salary if only name is provided
    }
    // Method to display employee details
    public void DisplayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an employee using the default constructor
        Employee employee1 = new Employee();
        employee1.DisplayEmployeeDetails();
        System.out.println(); // Adding a blank line for clarity
        // Creating an employee using the overloaded constructor
        Employee employee2 = new Employee("John Doe");
        employee2.DisplayEmployeeDetails();
    }
}
Output:
Employee Name: Unknown
Employee Salary: 0.0
Employee Name: John Doe
Employee Salary: 5000.0
