
public class Q2 {
    static int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int lowest=prices[0], bestProfit=0;
        for (int price: prices) {
            if (price<lowest) lowest=price;
            else if (price-lowest>bestProfit) bestProfit=price-lowest;
        }
        return bestProfit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
