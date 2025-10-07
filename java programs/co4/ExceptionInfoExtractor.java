/*
 * Intentionally causes an ArithmeticException (divide by zero) and prints
 * the exception type, message, and full stack trace.
 */

public class ExceptionInfoExtractor {
    public static void main(String[] args) {
        try {
            int x = 10 / 0; // causes ArithmeticException
            System.out.println(x); // unreachable
        } catch (Exception e) {
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}


