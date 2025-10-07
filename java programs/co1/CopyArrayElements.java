import java.util.Scanner; // Import the Scanner class for user input

public class CopyArrayElements { // Declare a class named CopyArrayElements
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements for the source array: ");
        int size = input.nextInt();

        // Handle case of empty or invalid array size
        if (size <= 0) {
            System.out.println("Array size must be positive.");
            input.close();
            return; // Exit the program if size is invalid
        }

        // Declare the source array of the specified size
        int[] sourceArray = new int[size];

        System.out.println("Enter " + size + " integer elements for the source array:");

        // Read elements into the source array using a for loop
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            sourceArray[i] = input.nextInt();
        }

        // Declare the destination array with the same size as the source array
        int[] destinationArray = new int[size];

        // Copy elements from sourceArray to destinationArray using a for loop
        for (int i = 0; i < size; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("\nOriginal Source Array:");
        printArray(sourceArray); // Call a helper method to print the source array

        System.out.println("Copied Destination Array:");
        printArray(destinationArray); // Print the destination array

        // Close the scanner to prevent resource leaks
        input.close();
    }

    // Helper method to print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println();
    }
}