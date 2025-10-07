/*
 * This program prompts the user to enter three lines of text,
 * writes them to user_input.txt, then reads and prints the contents.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserInputToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "user_input.txt";

        String[] lines = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }

        // Write user input lines to file
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                pw.println(line);
            }
            System.out.println("Wrote input to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Read and print file contents
        System.out.println("Reading file contents:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


