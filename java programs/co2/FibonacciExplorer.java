import java.util.Scanner;

public class FibonacciExplorer {

    // Static variable to count the number of recursive calls made to the fibonacci method
    public static int callCount = 0;

    /**
     * Recursively calculates the nth Fibonacci number.
     * This method also increments a static counter to track the number of times it's called.
     * Base cases: fibonacci(0) = 0, fibonacci(1) = 1.
     * Recursive case: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2) for n > 1.
     * @param n The index of the Fibonacci number to calculate (non-negative integer).
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        callCount++; // Increment the static call counter for each invocation

        // Base cases for the Fibonacci sequence
        if (n <= 1) {
            return n;
        }
        // Recursive step: sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            System.out.println("\nFirst " + n + " Fibonacci numbers:");
            // Loop to print each Fibonacci number from 0 to n-1
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println(); // Newline for cleaner output

            // Display the total number of recursive calls made
            System.out.println("Total recursive calls made: " + callCount);
        }

        scanner.close();
    }
}

/*
Sample Input/Output 1:

Enter the number of Fibonacci numbers to generate: 10

First 10 Fibonacci numbers:
0 1 1 2 3 5 8 13 21 34 
Total recursive calls made: 109

Sample Input/Output 2:

Enter the number of Fibonacci numbers to generate: 5

First 5 Fibonacci numbers:
0 1 1 2 3 
Total recursive calls made: 9

Sample Input/Output 3 (Invalid Input):

Enter the number of Fibonacci numbers to generate: -3
Please enter a non-negative integer.
*/


