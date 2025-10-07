import java.util.Scanner; // Import the Scanner class for user input

public class SimpleInterestCalculator { // Declare a class named SimpleInterestCalculator
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        // Read the principal amount (double) from the user
        double principal = input.nextDouble();

        // Prompt the user to enter the annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        // Read the interest rate (double) from the user
        double rate = input.nextDouble();

        // Prompt the user to enter the time period in years
        System.out.print("Enter the time period (in years): ");
        // Read the time period (double) from the user
        double time = input.nextDouble();

        // Calculate simple interest
        // Formula: Simple Interest = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Print the calculated simple interest to the console
        System.out.println("The Simple Interest is: " + simpleInterest);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

