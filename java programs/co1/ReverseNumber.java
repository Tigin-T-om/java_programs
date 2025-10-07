import java.util.Scanner; // Import the Scanner class for user input

public class ReverseNumber { // Declare a class named ReverseNumber
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer to reverse: ");
        // Read the integer from the user
        int number = input.nextInt();

        int reversedNumber = 0; // Initialize variable to store the reversed number
        int originalNumber = number; // Store the original number for printing

        // Use a while loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversedNumber
            number /= 10; // Remove the last digit from the number
        }

        // Print the reversed number to the console
        System.out.println("The reverse of " + originalNumber + " is: " + reversedNumber);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

