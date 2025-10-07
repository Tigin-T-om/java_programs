/*
 * This program creates report.txt and writes formatted lines using PrintWriter,
 * then confirms and displays the file contents.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FormattedReportWriter {
    public static void main(String[] args) {
        String fileName = "report.txt";

        // Write formatted content using PrintWriter
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("Report Title: Student Scores");
            pw.println("Student 1: Score = 85");
            pw.println("Student 2: Score = 93");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        System.out.println("Data written to " + fileName);
        System.out.println("The file " + fileName + " contents:");

        // Read the file back and display
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


