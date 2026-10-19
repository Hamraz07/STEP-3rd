
import java.util.Arrays;

public class Q1 {
    static void applyMultipliers(double[] scores,int captainIndex,int viceIndex) {
        scores[captainIndex]*=2.0;
        scores[viceIndex]*=1.5;
    }
    public static void main(String[] args) {
        double[] scores={40,55,30,62}; applyMultipliers(scores,1,3);
        System.out.println(Arrays.toString(scores));
    }
}
