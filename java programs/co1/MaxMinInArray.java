import java.util.Scanner; // Import the Scanner class for user input

public class MaxMinInArray { // Declare a class named MaxMinInArray
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

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Iterate through the rest of the array to find the maximum and minimum elements
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is greater
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if current element is smaller
            }
        }

        // Print the maximum and minimum elements to the console
        System.out.println("\nMaximum element in the array is: " + max);
        System.out.println("Minimum element in the array is: " + min);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



