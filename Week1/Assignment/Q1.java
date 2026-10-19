
public class Q1 {
    static void checkDuplicateSeats(int[] seats) {
        boolean found = false;
        System.out.print("Duplicate seat numbers: ");
        for (int i = 0; i < seats.length; i++) {
            boolean appearedEarlier = false;
            for (int k = 0; k < i; k++) if (seats[k] == seats[i]) appearedEarlier = true;
            if (appearedEarlier) continue;
            for (int j = i + 1; j < seats.length; j++) {
                if (seats[i] == seats[j]) {
                    System.out.print(seats[i] + " "); found = true; break;
                }
            }
        }
        if (!found) System.out.print("No Duplicate Seats Found");
        System.out.println();
    }
    public static void main(String[] args) {
        checkDuplicateSeats(new int[]{101, 102, 103, 102, 105});
        checkDuplicateSeats(new int[]{101, 102, 103, 104, 105});
    }
}
