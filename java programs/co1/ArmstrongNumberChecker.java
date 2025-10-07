import java.util.Scanner; // Import the Scanner class for user input

public class ArmstrongNumberChecker { // Declare a class named ArmstrongNumberChecker
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer to check if it's an Armstrong number: ");
        // Read the integer from the user
        int number = input.nextInt();

        int originalNumber = number; // Store the original number
        int numDigits = 0; // To store the number of digits
        int sumOfPowers = 0; // To store the sum of powers of digits

        // Calculate the number of digits
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numDigits++;
        }

        // Reset tempNumber to the original number to extract digits
        tempNumber = originalNumber;

        // Calculate the sum of each digit raised to the power of numDigits
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Get the last digit
            sumOfPowers += Math.pow(digit, numDigits); // Add (digit ^ numDigits) to sum
            tempNumber /= 10; // Remove the last digit
        }

        // Check if the sum of powers is equal to the original number
        if (sumOfPowers == originalNumber) {
            System.out.println(originalNumber + " is an ARMSTRONG number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



