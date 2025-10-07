import java.util.Scanner;

// Class representing a Student with name and marks
class Student {
    String name;
    double marks;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.marks = 0.0;
        System.out.println("Student object created using default constructor.");
    }

    // Parameterized constructor using 'this' keyword to differentiate between instance variables and parameters
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
        System.out.println("Student object created using parameterized constructor.");
    }

    // Method to set marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student's name, marks, and grade
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

// Main class to demonstrate the StudentRanker program
public class StudentRanker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demonstrate default constructor
        System.out.println("\n--- Demonstrating Default Constructor ---");
        Student student1 = new Student();
        student1.displayResult();

        System.out.print("Enter name for student1: ");
        student1.name = scanner.nextLine();
        System.out.print("Enter marks for " + student1.name + ": ");
        student1.setMarks(scanner.nextDouble());
        student1.displayResult();
        scanner.nextLine(); // Consume newline

        // Demonstrate parameterized constructor
        System.out.println("\n--- Demonstrating Parameterized Constructor ---");
        System.out.print("Enter name for student2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter marks for " + name2 + ": ");
        double marks2 = scanner.nextDouble();
        Student student2 = new Student(name2, marks2);
        student2.displayResult();

        scanner.close();
    }
}