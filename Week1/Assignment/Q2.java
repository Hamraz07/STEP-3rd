
import java.util.Scanner;

public class Q2 {
    static void checkTypingAccuracy(String original, String typed) {
        int total = Math.max(original.length(), typed.length()), matched = 0, firstMismatch = -1;
        for (int i = 0; i < total; i++) {
            boolean same = i < original.length() && i < typed.length() && original.charAt(i) == typed.charAt(i);
            if (same) matched++;
            else if (firstMismatch == -1) firstMismatch = i;
        }
        double accuracy = total == 0 ? 100.0 : matched * 100.0 / total;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, total, accuracy);
        if (firstMismatch == -1) System.out.println(" | No Mismatches");
        else {
            String expected = firstMismatch < original.length() ? "'" + original.charAt(firstMismatch) + "'" : "<end>";
            String actual = firstMismatch < typed.length() ? "'" + typed.charAt(firstMismatch) + "'" : "<end>";
            System.out.printf(" | First Mismatch at position %d (%s vs %s)%n", firstMismatch + 1, expected, actual);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Original passage: "); String original = input.nextLine();
        System.out.print("Your typed text: "); String typed = input.nextLine();
        checkTypingAccuracy(original, typed);
        input.close();
    }
}
