
import java.util.Scanner;

public class Q1 {
    static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toLowerCase(text.charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') vowels++;
            else if (letter >= 'a' && letter <= 'z') consonants++;
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); System.out.print("Enter text: ");
        countVowelsAndConsonants(input.nextLine()); input.close();
    }
}
