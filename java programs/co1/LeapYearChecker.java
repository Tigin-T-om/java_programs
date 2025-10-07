import java.util.Scanner; // Import the Scanner class for user input

public class LeapYearChecker { // Declare a class named LeapYearChecker
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year to check if it's a leap year: ");
        // Read the year (integer) from the user
        int year = input.nextInt();

        boolean isLeapYear; // Declare a boolean variable to store the result

        // A year is a leap year if it is divisible by 4
        // but not by 100, unless it is also divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        // Print the result to the console
        if (isLeapYear) {
            System.out.println(year + " is a LEAP YEAR.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

