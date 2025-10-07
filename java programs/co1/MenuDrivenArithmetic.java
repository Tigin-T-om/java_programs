import java.util.Scanner; // Import the Scanner class for user input

public class MenuDrivenArithmetic { // Declare a class named MenuDrivenArithmetic
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        double num1, num2, result; // Declare variables for numbers and result
        int choice; // Declare a variable for user's menu choice

        do {
            // Display the menu of operations
            System.out.println("\nMenu-Driven Arithmetic Operations:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Perform action based on user's choice
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    // Handle division by zero error
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5); // Continue loop until user chooses to exit (choice 5)

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

