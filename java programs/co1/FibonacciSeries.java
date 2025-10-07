import java.util.Scanner; // Import the Scanner class for user input

public class FibonacciSeries { // Declare a class named FibonacciSeries
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        // Read the number of terms (integer) from the user
        int n = input.nextInt();

        // Initialize the first two terms of the Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Handle cases for 0, 1, and more terms
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println(firstTerm);
        } else {
            System.out.print(firstTerm + ", " + secondTerm); // Print the first two terms
            // Generate and print the remaining terms using a for loop
            for (int i = 2; i < n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(", " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println(); // Move to the next line after printing the series
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



