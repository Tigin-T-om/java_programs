import java.util.Scanner; // Import the Scanner class for user input

public class SumOfTwoNumbers { // Declare a class named SumOfTwoNumbers
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number (integer) from the user
        int num1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number (integer) from the user
        int num2 = input.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Print the result to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

