// EmployeeProtectedData.java

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void setManagerDetails(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Name: " + this.name);
        System.out.println("Manager Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }
}

public class EmployeeProtectedData {
    public static void main(String[] args) {
        System.out.println("--- Employee Information ---");
        Employee emp1 = new Employee("Alice", 50000.0);
        emp1.displayEmployeeInfo();
        System.out.println();

        System.out.println("--- Manager Information ---");
        Manager mgr1 = new Manager("Bob", 75000.0, "Sales");
        mgr1.displayManagerDetails();
        System.out.println();

        System.out.println("--- Updating Manager Information ---");
        mgr1.setManagerDetails("Robert Smith", 80000.0, "Marketing");
        mgr1.displayManagerDetails();

        // Note: protected fields cannot be accessed here directly (outside subclass/same package).
    }
}

/*
Expected Output:

--- Employee Information ---
Employee Name: Alice
Employee Salary: 50000.0

--- Manager Information ---
Manager Name: Bob
Manager Salary: 75000.0
Department: Sales

--- Updating Manager Information ---
Manager Name: Robert Smith
Manager Salary: 80000.0
Department: Marketing
*/
