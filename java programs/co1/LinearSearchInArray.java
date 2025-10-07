import java.util.Scanner; // Import the Scanner class for user input

public class LinearSearchInArray { // Declare a class named LinearSearchInArray
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

        // Prompt the user to enter the element to search for
        System.out.print("\nEnter the element to search for: ");
        int searchElement = input.nextInt();

        int foundAtIndex = -1; // Initialize to -1 to indicate not found

        // Perform linear search
        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchElement) {
                foundAtIndex = i; // Store the index if element is found
                break; // Exit the loop as soon as the element is found
            }
        }

        // Print the search result to the console
        if (foundAtIndex != -1) {
            System.out.println(searchElement + " found at index: " + foundAtIndex + " (position " + (foundAtIndex + 1) + ").");
        } else {
            System.out.println(searchElement + " not found in the array.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



