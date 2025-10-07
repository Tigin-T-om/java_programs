import java.util.Scanner; // Import the Scanner class for user input

public class GradeCalculator { // Declare a class named GradeCalculator
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the marks
        System.out.print("Enter the marks (0-100): ");
        // Read the marks (integer) from the user
        int marks = input.nextInt();

        char grade; // Declare a char variable to store the grade

        // Determine the grade based on the marks using if-else if-else statements
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter marks between 0 and 100.");
            grade = 'N'; // 'N' for Not Applicable or Invalid
        } else if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Print the calculated grade to the console, if marks were valid
        if (grade != 'N') {
            System.out.println("The grade for " + marks + " marks is: " + grade);
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

