import java.util.Scanner; // Import the Scanner class for user input

public class FactorialCalculator { // Declare a class named FactorialCalculator
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        // Read the integer from the user
        int number = input.nextInt();

        // Handle negative input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("The factorial of 0 is: 1");
        } else {
            long factorial = 1; // Use long to handle larger factorial values
            // Calculate factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by current number in each iteration
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

