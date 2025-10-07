/*
 * Asks the user for a number. If it's negative, throws an ArithmeticException
 * with a custom message; otherwise prints the square root.
 */
import java.util.Scanner;

public class CustomExceptionValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            double n = Double.parseDouble(sc.nextLine().trim());
            if (n < 0) {
                throw new ArithmeticException("Cannot compute square root of a negative number!");
            }
            System.out.println("Square root is: " + Math.sqrt(n));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
        }
    }
}


