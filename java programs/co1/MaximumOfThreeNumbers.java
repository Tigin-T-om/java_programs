import java.util.Scanner; // Import the Scanner class for user input

public class MaximumOfThreeNumbers { // Declare a class named MaximumOfThreeNumbers
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

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        // Read the third number (integer) from the user
        int num3 = input.nextInt();

        int max; // Declare a variable to store the maximum number

        // Determine the maximum number using if-else if-else statements
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        // Print the maximum number to the console
        System.out.println("The maximum of the three numbers is: " + max);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

