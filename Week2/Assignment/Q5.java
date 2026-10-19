
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q5 {
    static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase().replace('.', ' ').replace(',', ' ');
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        Map<String, Integer> counts = new HashMap<>();
        for (String word : cleaned.trim().split("\\s+")) {
            if (word.isEmpty()) continue;
            boolean skip = false;
            for (String stop : stopWords) if (word.equals(stop)) skip = true;
            if (!skip) counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        List<String> words = new ArrayList<>(counts.keySet());
        words.sort((first, second) -> Integer.compare(counts.get(second), counts.get(first)));
        for (String word : words) System.out.println(word + ": " + counts.get(word));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); System.out.print("Enter feedback: ");
        printFilteredWordFrequency(input.nextLine()); input.close();
    }
}
