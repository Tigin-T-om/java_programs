import java.util.Scanner; // Import the Scanner class for user input

public class SwapVariables { // Declare a class named SwapVariables
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // --- Swapping with a third variable ---
        System.out.println("\n--- Swapping with a third variable ---");

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (for swap with third variable): ");
        // Read the first number (integer) from the user
        int a = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (for swap with third variable): ");
        // Read the second number (integer) from the user
        int b = input.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Use a temporary variable to swap a and b
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        // --- Swapping without a third variable ---
        System.out.println("\n--- Swapping without a third variable ---");

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (for swap without third variable): ");
        // Read the first number (integer) from the user
        int x = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (for swap without third variable): ");
        // Read the second number (integer) from the user
        int y = input.nextInt();

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Swapping without a third variable (using arithmetic operators)
        x = x + y; // x becomes sum of original x and y
        y = x - y; // y becomes original x ( (x+y) - y )
        x = x - y; // x becomes original y ( (x+y) - x )

        System.out.println("After swapping: x = " + x + ", y = " + y);

        // Close the scanner
        input.close();
    }
}

