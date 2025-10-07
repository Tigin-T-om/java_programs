/*
 * Prompts for an integer, parses it, and divides 100 by the number.
 * Handles NumberFormatException and ArithmeticException separately.
 */
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = sc.nextLine().trim();
        try {
            int n = Integer.parseInt(input);
            int result = 100 / n;
            System.out.println("Result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}


