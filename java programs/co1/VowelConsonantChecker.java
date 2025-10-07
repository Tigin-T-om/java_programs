import java.util.Scanner; // Import the Scanner class for user input

public class VowelConsonantChecker { // Declare a class named VowelConsonantChecker
    public static void main(String[] args) { // Main method, the entry point of the program
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        // Read the first character of the input string
        char ch = input.next().charAt(0);

        // Convert the character to lowercase to handle both uppercase and lowercase input
        char lowerCaseCh = Character.toLowerCase(ch);

        // Check if the character is an alphabet (a-z or A-Z)
        if (lowerCaseCh >= 'a' && lowerCaseCh <= 'z') {
            // Check if the character is a vowel
            if (lowerCaseCh == 'a' || lowerCaseCh == 'e' || lowerCaseCh == 'i' || lowerCaseCh == 'o' || lowerCaseCh == 'u') {
                System.out.println(ch + " is a VOWEL.");
            } else {
                System.out.println(ch + " is a CONSONANT.");
            }
        } else {
            // If it's not an alphabet
            System.out.println(ch + " is not an alphabet.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

