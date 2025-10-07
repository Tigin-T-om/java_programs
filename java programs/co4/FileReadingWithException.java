/*
 * Declares readFile() with throws IOException. Attempts to read data.txt.
 * Catches exceptions in main and prints clear messages.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingWithException {
    public static void main(String[] args) {
        System.out.println("Trying to open 'data.txt'");
        try {
            String content = readFile();
            System.out.println("File contains: " + content);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    // Reads first line of data.txt, may throw IOException
    static String readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = br.readLine();
            return line == null ? "" : line;
        }
    }
}


