import java.util.Scanner; // Import the Scanner class for user input

public class SumAverageArrayElements { // Declare a class named SumAverageArrayElements
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements for the array: ");
        int size = input.nextInt();

        // Handle case of empty or invalid array size
        if (size <= 0) {
            System.out.println("Array size must be positive.");
            input.close();
            return; // Exit the program if size is invalid
        }

        // Declare an integer array of the specified size
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integer elements:");

        // Read elements into the array using a for loop
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int sum = 0; // Initialize sum of elements
        // Calculate the sum of array elements using a for-each loop
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average of array elements
        // Cast sum to double to ensure floating-point division
        double average = (double) sum / size;

        // Print the sum and average to the console
        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



