
public class Q4 {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0, highest = Integer.MIN_VALUE, section = 0, index = 0;
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highest) { highest = sectionA[i]; section = 1; index = i; }
            totalB += sectionB[i];
            if (sectionB[i] > highest) { highest = sectionB[i]; section = 2; index = i; }
        }
        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (Section %s, Item %d)%n",
                totalA, totalB, status, highest, section == 1 ? "A" : "B", index + 1);
    }
    public static void main(String[] args) {
        analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30});
    }
}
