
import java.util.Scanner;

public class Q4 {
    static Character findFirstNonRepeatingChar(String text) {
        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++)
                if (text.charAt(i) == text.charAt(j)) count++;
            if (count == 1) return text.charAt(i);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        Character result = findFirstNonRepeatingChar(text);
        if (result == null) System.out.println("No Non-Repeating Character Found");
        else System.out.println("First Non-Repeating Character: '" + result + "'");
        input.close();
    }
}
