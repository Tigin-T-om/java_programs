/*
 * This program asks the user to enter 5 integers, computes their sum,
 * writes the sum to sum.txt, then reads it back and displays it.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "sum.txt";

        int[] numbers = new int[5];
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                // If input is invalid, consume it and treat as 0 for simplicity
                scanner.next();
                numbers[i] = 0;
            }
        }

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        // Write sum to file
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println(sum);
            System.out.println("Sum written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Read sum back
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            if (line != null) {
                System.out.println("Sum read from file: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


