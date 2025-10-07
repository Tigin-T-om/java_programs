import java.util.Scanner; // Import the Scanner class for user input

public class PositiveNegativeZeroChecker { // Declare a class named PositiveNegativeZeroChecker
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        // Read the number (double) from the user
        double number = input.nextDouble();

        // Check if the number is positive, negative, or zero using if-else if-else statements
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number.");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number.");
        } else {
            System.out.println(number + " is ZERO.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

