
import java.util.Scanner;

public class Q4 {
    static String maskPhoneNumber(String phone) {
        if (phone.length() != 10) return "Invalid phone number";
        for (int i = 0; i < phone.length(); i++) if (!Character.isDigit(phone.charAt(i))) return "Invalid phone number";
        StringBuilder result = new StringBuilder("XXXXXX");
        result.insert(result.length(), "-").append(phone.substring(6));
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); System.out.print("Enter 10-digit phone number: ");
        System.out.println(maskPhoneNumber(input.nextLine())); input.close();
    }
}
