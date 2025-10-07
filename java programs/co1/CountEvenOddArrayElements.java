import java.util.Scanner; // Import the Scanner class for user input

public class CountEvenOddArrayElements { // Declare a class named CountEvenOddArrayElements
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

        int evenCount = 0; // Initialize count for even numbers
        int oddCount = 0;  // Initialize count for odd numbers

        // Iterate through the array to count even and odd elements
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++; // Increment evenCount if the number is even
            } else {
                oddCount++;  // Increment oddCount if the number is odd
            }
        }

        // Print the counts of even and odd elements to the console
        System.out.println("\nNumber of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



