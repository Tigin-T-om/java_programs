import java.util.Scanner; // Import the Scanner class for user input

public class ReverseArray { // Declare a class named ReverseArray
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

        System.out.println("\nOriginal Array:");
        printArray(numbers); // Call a helper method to print the array

        // Reverse the array
        for (int i = 0; i < size / 2; i++) {
            int temp = numbers[i]; // Store the current element in a temporary variable
            numbers[i] = numbers[size - 1 - i]; // Swap current element with element from the end
            numbers[size - 1 - i] = temp; // Assign the stored element to the end position
        }

        System.out.println("\nReversed Array:");
        printArray(numbers); // Print the reversed array

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



