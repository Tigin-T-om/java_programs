/*
 * This program writes a welcome message to welcome.txt using FileWriter,
 * then reads and prints the file content using BufferedReader.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadTextFile {
    public static void main(String[] args) {
        String fileName = "welcome.txt";

        // Write text to the file using try-with-resources
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Welcome to Java File I/O!");
            System.out.println("Wrote to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Read and print the content using BufferedReader
        System.out.println("Reading from file: " + fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                System.out.println("From file: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


