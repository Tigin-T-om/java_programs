import java.util.Scanner; // Import the Scanner class for user input

public class PrimeNumberChecker { // Declare a class named PrimeNumberChecker
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer to check if it's a prime number: ");
        // Read the integer from the user
        int number = input.nextInt();

        boolean isPrime = true; // Assume the number is prime initially

        // Handle cases for numbers less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for divisibility from 2 up to the square root of the number
            // We only need to check up to the square root because if a number n has a divisor greater than its square root,
            // it must also have a divisor smaller than its square root.
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not a prime number
                    break; // Exit the loop as soon as a divisor is found
                }
            }
        }

        // Print the result to the console
        if (isPrime) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



