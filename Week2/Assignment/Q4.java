
import java.util.Scanner;

public class Q4 {
    static String normalizeCode(String raw) {
        String code = raw.trim();
        return code.length() < 3 ? code.toUpperCase() : code.substring(0, 3).toUpperCase() + code.substring(3);
    }
    static String validateAndFormat(String code) {
        if (code.length() != 13) return "Invalid: code must be 13 characters";
        for (int i = 0; i < 3; i++) if (!Character.isLetter(code.charAt(i))) return "Invalid: publisher code must be 3 letters";
        for (int i = 3; i < code.length(); i++) if (!Character.isDigit(code.charAt(i))) return "Invalid: year and catalog must be digits";
        return new StringBuilder("[").append(code.substring(0, 3)).append("] YEAR: ")
                .append(code.substring(3, 7)).append(" | CATALOG: ").append(code.substring(7)).toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); System.out.print("Enter code: ");
        System.out.println(validateAndFormat(normalizeCode(input.nextLine()))); input.close();
    }
}
