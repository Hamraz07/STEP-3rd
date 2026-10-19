
public class Q5 {
    static class Cart {
        private final String cartId;private final double[] prices;private int itemCount;
        Cart(String cartId,int capacity){this.cartId=cartId;prices=new double[capacity];}
        void addItem(double price){if(price>=0&&itemCount<prices.length)prices[itemCount++]=price;else System.out.println("Item not added");}
        double getTotal(){double total=0;for(int i=0;i<itemCount;i++)total+=prices[i];return total;}
        int getItemCount(){return itemCount;}
        String getCartId(){return cartId;}
    }
    public static void main(String[] args) {
        Cart cart=new Cart("CART-5",20);cart.addItem(250);cart.addItem(99);cart.addItem(151);
        System.out.println("Total: "+cart.getTotal());System.out.println("Count: "+cart.getItemCount());
    }
}
