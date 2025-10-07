import java.util.Scanner; // Import the Scanner class for user input

public class Calculator { // Declare a class named Calculator
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        double num1, num2, result; // Declare variables for numbers and result
        char operator; // Declare a variable for the operator

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        // Perform calculation based on the operator using a switch-case statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                // Handle division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break;
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

