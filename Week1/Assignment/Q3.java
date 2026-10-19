
import java.util.Scanner;

public class Q3 {
    static void findLongestStreak(String log) {
        if (log.isEmpty()) { System.out.println("No signal readings"); return; }
        char bestColor = log.charAt(0), currentColor = bestColor;
        int bestLength = 1, currentLength = 1;
        for (int i = 1; i < log.length(); i++) {
            if (log.charAt(i) == currentColor) currentLength++;
            else { currentColor = log.charAt(i); currentLength = 1; }
            if (currentLength > bestLength) { bestLength = currentLength; bestColor = currentColor; }
        }
        System.out.println("Longest Streak: '" + bestColor + "' repeated " + bestLength + " times");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Signal log (R/Y/G): ");
        findLongestStreak(input.nextLine());
        input.close();
    }
}
