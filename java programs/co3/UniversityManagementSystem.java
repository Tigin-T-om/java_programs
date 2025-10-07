// UniversityManagementSystem.java

// Abstraction: Abstract class Person defines common attributes and an abstract method.
abstract class Person {
    // Encapsulation: Private fields for name and id.
    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters for private fields.
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Setters for private fields.
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Abstraction: Abstract method to be implemented by subclasses.
    public abstract String getRole();

    // Non-abstract method for common details.
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Inheritance: Student class inherits from Person.
class Student extends Person {
    private String major;

    public Student(String name, String id, String major) {
        super(name, id);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Polymorphism/Inheritance: Overriding the abstract method.
    @Override
    public String getRole() {
        return "Student";
    }

    // Encapsulation: Display method to show all student details.
    public void displayDetails() {
        super.displayBasicInfo();
        System.out.println("Major: " + major);
        System.out.println("Role: " + getRole());
    }
}

// Inheritance: Professor class inherits from Person.
class Professor extends Person {
    private String department;

    public Professor(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Polymorphism/Inheritance: Overriding the abstract method.
    @Override
    public String getRole() {
        return "Professor";
    }

    // Encapsulation: Display method to show all professor details.
    public void displayDetails() {
        super.displayBasicInfo();
        System.out.println("Department: " + department);
        System.out.println("Role: " + getRole());
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Demonstrating Abstraction, Inheritance, and Encapsulation.

        // Create a Student object (Inheritance from Person).
        System.out.println("--- Student Information ---");
        Student student1 = new Student("Alice Smith", "S001", "Computer Science");
        student1.displayDetails(); // Encapsulation: Accessing data via public methods.
        System.out.println();

        // Modify student details using setters (Encapsulation).
        student1.setName("Alicia J. Smith");
        student1.setMajor("Software Engineering");
        System.out.println("--- Updated Student Information ---");
        student1.displayDetails();
        System.out.println();

        // Create a Professor object (Inheritance from Person).
        System.out.println("--- Professor Information ---");
        Professor prof1 = new Professor("Dr. John Doe", "P001", "Physics");
        prof1.displayDetails(); // Encapsulation: Accessing data via public methods.
        System.out.println();

        // Demonstrate polymorphism by treating objects as their superclass type.
        System.out.println("--- Polymorphism Demonstration ---");
        Person p1 = new Student("Bob Johnson", "S002", "Mathematics");
        Person p2 = new Professor("Dr. Jane White", "P002", "Chemistry");

        // Calling getRole() on Person references invokes the overridden method in subclasses.
        System.out.println(p1.getName() + "'s Role: " + p1.getRole());
        System.out.println(p2.getName() + "'s Role: " + p2.getRole());
    }
}

/*
Sample Input/Output:

--- Student Information ---
Name: Alice Smith
ID: S001
Major: Computer Science
Role: Student

--- Updated Student Information ---
Name: Alicia J. Smith
ID: S001
Major: Software Engineering
Role: Student

--- Professor Information ---
Name: Dr. John Doe
ID: P001
Department: Physics
Role: Professor

--- Polymorphism Demonstration ---
Bob Johnson's Role: Student
Dr. Jane White's Role: Professor
*/
