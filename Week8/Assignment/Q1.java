
import java.util.Scanner;

public class Q1 {
    interface CustomerBill { double finalAmount(double bill); }
    static class Student implements CustomerBill { public double finalAmount(double x){return x*0.90;} }
    static class Staff implements CustomerBill { public double finalAmount(double x){return x*0.95;} }
    static class Guest implements CustomerBill { public double finalAmount(double x){return x+10;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();double amount=in.nextDouble();CustomerBill customer;
            if(type.equals("STUDENT"))customer=new Student();else if(type.equals("STAFF"))customer=new Staff();else customer=new Guest();
            double paid=customer.finalAmount(amount);total+=paid;System.out.printf("%s: %.2f%n",type,paid);
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
