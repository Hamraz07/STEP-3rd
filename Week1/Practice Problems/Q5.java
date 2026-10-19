
import java.util.Scanner;

public class Q5 {
    static String reverseCustomerName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverseCustomerName(name));
        input.close();
    }
}
