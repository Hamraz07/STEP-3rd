
import java.util.Scanner;

public class Q5 {
    static String normalizeReference(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) return trimmed.toUpperCase();
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }
    static String validateAndFormat(String reference) {
        if (reference.length() != 14) return "Invalid: reference must be 14 characters";
        for (int i = 0; i < 3; i++) if (!Character.isLetter(reference.charAt(i))) return "Invalid: bank code must be 3 letters";
        for (int i = 3; i < reference.length(); i++) if (!Character.isDigit(reference.charAt(i))) return "Invalid: date and sequence must be digits";
        String date = reference.substring(3, 5) + "/" + reference.substring(5, 7) + "/" + reference.substring(7, 9);
        return new StringBuilder().append('[').append(reference.substring(0, 3)).append("] DATE: ")
                .append(date).append(" | SEQ: ").append(reference.substring(9)).toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); System.out.print("Enter transaction reference: ");
        System.out.println(validateAndFormat(normalizeReference(input.nextLine()))); input.close();
    }
}
