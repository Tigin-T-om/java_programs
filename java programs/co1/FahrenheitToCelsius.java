import java.util.Scanner; // Import the Scanner class for user input

public class FahrenheitToCelsius { // Declare a class named FahrenheitToCelsius
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        // Read the temperature in Fahrenheit (double) from the user
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        // Formula: Celsius = (Fahrenheit - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5.0 / 9.0; // Use 5.0/9.0 for floating-point division

        // Print the converted temperature in Celsius to the console
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

