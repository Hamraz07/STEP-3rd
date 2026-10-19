
import java.util.Scanner;

public class Q2 {
    static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
    static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }
    static boolean isPalindromeByReversal(String text) {
        char[] letters = text.toCharArray();
        int left = 0, right = letters.length - 1;
        while (left < right) {
            char temp = letters[left]; letters[left] = letters[right]; letters[right] = temp;
            left++; right--;
        }
        return text.equals(new String(letters));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();
        System.out.println("Iterative: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " + (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array Reversal: " + (isPalindromeByReversal(text) ? "Palindrome" : "Not Palindrome"));
        input.close();
    }
}
