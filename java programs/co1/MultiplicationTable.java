import java.util.Scanner; // Import the Scanner class for user input

public class MultiplicationTable { // Declare a class named MultiplicationTable
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to generate its multiplication table: ");
        // Read the number (integer) from the user
        int number = input.nextInt();

        // Prompt the user to enter the limit for the multiplication table
        System.out.print("Enter the limit for the multiplication table (e.g., 10 for up to 10 times): ");
        // Read the limit (integer) from the user
        int limit = input.nextInt();

        System.out.println("\nMultiplication Table for " + number + " up to " + limit + ":");

        // Use a for loop to generate and print the multiplication table
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

