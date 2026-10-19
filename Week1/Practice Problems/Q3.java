
import java.util.Scanner;

public class Q3 {
    static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of people: ");
        int count = input.nextInt();
        double[] heights = new double[count], weights = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Person " + (i + 1) + " height (m) and weight (kg): ");
            heights[i] = input.nextDouble(); weights[i] = input.nextDouble();
        }
        System.out.println("Person | Height | Weight | BMI | Status");
        for (int i = 0; i < count; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("%d | %.2f | %.2f | %.2f | %s%n", i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
        input.close();
    }
}
