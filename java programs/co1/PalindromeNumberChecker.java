import java.util.Scanner; // Import the Scanner class for user input

public class PalindromeNumberChecker { // Declare a class named PalindromeNumberChecker
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer to check if it's a palindrome: ");
        // Read the integer from the user
        int number = input.nextInt();

        int originalNumber = number; // Store the original number
        int reversedNumber = 0; // Initialize variable to store the reversed number

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversedNumber
            number /= 10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a PALINDROME number.");
        } else {
            System.out.println(originalNumber + " is NOT a palindrome number.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



