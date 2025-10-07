import java.util.Scanner; // Import the Scanner class for user input

public class OddEvenChecker { // Declare a class named OddEvenChecker
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer to check if it's odd or even: ");
        // Read the integer from the user
        int number = input.nextInt();

        // Check if the number is even or odd using the modulo operator
        // If a number divided by 2 has a remainder of 0, it's even. Otherwise, it's odd.
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

