/*
 * Demonstrates try-catch-finally. Simulates opening a resource, causes
 * an exception, catches it, then closes the resource in finally.
 */

public class FinallyBlockDemo {
    public static void main(String[] args) {
        System.out.println("Resource opened");
        try {
            int n = 1 / 0; // intentional exception
            System.out.println(n); // unreachable
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        } finally {
            System.out.println("Resource closed");
        }
        System.out.println("Program continues after try-catch-finally.");
    }
}


