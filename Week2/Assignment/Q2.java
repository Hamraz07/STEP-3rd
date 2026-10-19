
import java.util.Scanner;

public class Q2 {
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ", -1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) result.append(' ');
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); System.out.print("Enter a sentence: ");
        System.out.println(reverseEachWord(input.nextLine())); input.close();
    }
}
