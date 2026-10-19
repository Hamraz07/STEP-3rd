
import java.util.Scanner;

public class Q1 {
    static class Ticket {
        static final double CONVENIENCE_FEE=20;String seat;int count;double price;
        Ticket(String seat,int count,double price){this.seat=seat;this.count=count;this.price=price;}
        double total(){return count*(price+CONVENIENCE_FEE);}
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String seat=in.next();int count=in.nextInt();double price;
            if(seat.equals("REGULAR"))price=150;else if(seat.equals("PREMIUM"))price=250;else price=400;
            Ticket ticket=new Ticket(seat,count,price);total+=ticket.total();System.out.printf("%s: %.2f%n",seat,ticket.total());
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
