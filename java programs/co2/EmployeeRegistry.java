import java.util.Scanner;

// Class representing an Employee
class Employee {
    private int empId;       // Employee ID
    private String name;     // Employee Name
    private double salary;   // Employee Salary

    // Constructor to initialize an Employee object
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        System.out.println("Employee " + name + " (ID: " + empId + ") created.");
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: $" + String.format("%.2f", salary));
    }

    // Method to update employee's salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary for " + name + " (ID: " + empId + ") updated to $" + String.format("%.2f", newSalary));
        } else {
            System.out.println("Invalid salary for " + name + ". Salary must be positive.");
        }
    }

    // Getter for Employee ID
    public int getEmpId() {
        return empId;
    }

    // Getter for Employee Name
    public String getName() {
        return name;
    }

    // Getter for Employee Salary
    public double getSalary() {
        return salary;
    }
}

// Class to manage an array of Employee objects
public class EmployeeRegistry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees to register: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to hold Employee objects
        Employee[] employees = new Employee[numEmployees];

        System.out.println("\n--- Registering Employees ---");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employees[i] = new Employee(empId, name, salary);
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }

        // Demonstrate updating salary for a specific employee
        System.out.println("\n--- Updating Salary ---");
        System.out.print("Enter Employee ID to update salary: ");
        int idToUpdate = scanner.nextInt();
        System.out.print("Enter new salary: ");
        double newSalary = scanner.nextDouble();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getEmpId() == idToUpdate) {
                emp.updateSalary(newSalary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + idToUpdate + " not found.");
        }

        System.out.println("\n--- Employee Details After Salary Update ---");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }

        // Demonstrate object passing (e.g., passing an Employee object to a method)
        System.out.println("\n--- Demonstrating Object Passing ---");
        if (numEmployees > 0) {
            System.out.println("Original salary for " + employees[0].getName() + ": $" + String.format("%.2f", employees[0].getSalary()));
            // Call a method that takes an Employee object as a parameter
            promoteEmployee(employees[0], 0.10); // Promote first employee by 10%
            System.out.println("New salary for " + employees[0].getName() + " after promotion: $" + String.format("%.2f", employees[0].getSalary()));
        } else {
            System.out.println("No employees to demonstrate object passing.");
        }

        scanner.close();
    }

    /**
     * Static method to demonstrate object passing. It takes an Employee object
     * and a bonus percentage, then updates the employee's salary.
     * @param employee The Employee object to promote.
     * @param bonusPercentage The percentage by which to increase the salary.
     */
    public static void promoteEmployee(Employee employee, double bonusPercentage) {
        System.out.println("Promoting employee: " + employee.getName());
        double currentSalary = employee.getSalary();
        double newSalary = currentSalary * (1 + bonusPercentage);
        employee.updateSalary(newSalary);
    }
}

/*
Sample Input/Output:

Enter the number of employees to register: 2

--- Registering Employees ---

Enter details for Employee 1:
Enter Employee ID: 101
Enter Name: John Doe
Enter Salary: 50000
Employee John Doe (ID: 101) created.

Enter details for Employee 2:
Enter Employee ID: 102
Enter Name: Jane Smith
Enter Salary: 60000
Employee Jane Smith (ID: 102) created.

--- Employee Details ---
ID: 101, Name: John Doe, Salary: $50000.00
ID: 102, Name: Jane Smith, Salary: $60000.00

--- Updating Salary ---
Enter Employee ID to update salary: 101
Enter new salary: 55000
Salary for John Doe (ID: 101) updated to $55000.00

--- Employee Details After Salary Update ---
ID: 101, Name: John Doe, Salary: $55000.00
ID: 102, Name: Jane Smith, Salary: $60000.00

--- Demonstrating Object Passing ---
Original salary for John Doe: $55000.00
Promoting employee: John Doe
Salary for John Doe (ID: 101) updated to $60500.00
New salary for John Doe after promotion: $60500.00
*/


