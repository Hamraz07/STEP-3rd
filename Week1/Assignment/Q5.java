
import java.util.Scanner;

public class Q5 {
    static void classifyWordLengths(String review) {
        int shortWords = 0, mediumWords = 0, longWords = 0;
        for (String word : review.trim().split("\\s+")) {
            if (word.isEmpty()) continue;
            int length = word.length();
            if (length <= 4) shortWords++;
            else if (length <= 8) mediumWords++;
            else longWords++;
        }
        System.out.printf("Short: %d | Medium: %d | Long: %d%n", shortWords, mediumWords, longWords);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a review: ");
        classifyWordLengths(input.nextLine());
        input.close();
    }
}
