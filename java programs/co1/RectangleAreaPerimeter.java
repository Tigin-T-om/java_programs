import java.util.Scanner; // Import the Scanner class for user input

public class RectangleAreaPerimeter { // Declare a class named RectangleAreaPerimeter
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        // Read the length (double) from the user
        double length = input.nextDouble();

        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        // Read the width (double) from the user
        double width = input.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (length + width);

        // Print the calculated area to the console
        System.out.println("The area of the rectangle is: " + area);
        // Print the calculated perimeter to the console
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

