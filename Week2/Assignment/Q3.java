
import java.util.Scanner;

public class Q3 {
    static void parseInventoryRecord(String line) {
        String[] fields = line.split(",", -1);
        if (fields.length != 3) { System.out.println("Invalid Record"); return; }
        System.out.println("Product: " + fields[0].trim() + " | SKU: " + fields[1].trim() + " | Qty: " + fields[2].trim());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); System.out.print("Enter ProductName,SKU,Quantity: ");
        parseInventoryRecord(input.nextLine()); input.close();
    }
}
