import java.util.Scanner; // Import the Scanner class for user input

public class SumOfDigits { // Declare a class named SumOfDigits
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer to calculate the sum of its digits: ");
        // Read the integer from the user
        int number = input.nextInt();

        int sum = 0; // Initialize variable to store the sum of digits
        int originalNumber = number; // Store the original number for printing

        // Use a while loop to calculate the sum of digits
        // The loop continues as long as the number is not 0
        while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        // Print the sum of digits to the console
        System.out.println("The sum of digits of " + originalNumber + " is: " + sum);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

