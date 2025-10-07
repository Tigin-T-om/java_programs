import java.util.Scanner; // Import the Scanner class for user input

public class ReadPrintArrayElements { // Declare a class named ReadPrintArrayElements
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements for the array: ");
        int size = input.nextInt();

        // Declare an integer array of the specified size
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integer elements:");

        // Read elements into the array using a for loop
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nArray elements are:");

        // Print elements from the array using a for loop
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}



