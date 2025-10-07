import java.util.Scanner; // Import the Scanner class for user input

public class FindSecondLargestInArray { // Declare a class named FindSecondLargestInArray
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements for the array: ");
        int size = input.nextInt();

        // Handle case of empty or invalid array size
        if (size < 2) { // Need at least two elements to find a second largest
            System.out.println("Please enter an array with at least two elements.");
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

        // Initialize first and second largest with minimum possible integer value
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the first and second largest elements
        for (int number : numbers) {
            if (number > firstLargest) {
                secondLargest = firstLargest; // Current firstLargest becomes secondLargest
                firstLargest = number;       // Current number becomes firstLargest
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number; // Update secondLargest if current number is between firstLargest and secondLargest
            }
        }

        // Print the second largest element to the console
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("\nThere is no second largest element (all elements might be the same).");
        } else {
            System.out.println("\nThe second largest element in the array is: " + secondLargest);
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



