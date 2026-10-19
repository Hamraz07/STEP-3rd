
import java.util.Scanner;

public class Q1 {
    interface PaymentMethod { double finalAmount(double amount); }
    static class Card implements PaymentMethod { public double finalAmount(double amount){return amount*1.02;} }
    static class Wallet implements PaymentMethod { public double finalAmount(double amount){return amount*1.01;} }
    static class BankTransfer implements PaymentMethod { public double finalAmount(double amount){return amount;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();double amount=in.nextDouble();PaymentMethod method;
            if(type.equals("CARD"))method=new Card();else if(type.equals("WALLET"))method=new Wallet();else method=new BankTransfer();
            double adjusted=method.finalAmount(amount);total+=adjusted;System.out.printf("%s: %.2f%n",type,adjusted);
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
