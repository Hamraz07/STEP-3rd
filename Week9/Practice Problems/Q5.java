
import java.util.Scanner;

public class Q5 {
    static abstract class Booking { double distance;static final double BOOKING_FEE=50;Booking(double d){distance=d;}abstract double baseFare();double total(){return baseFare()+BOOKING_FEE;} }
    static class Bus extends Booking { Bus(double d){super(d);}double baseFare(){return distance*2;} }
    static class Train extends Booking { Train(double d){super(d);}double baseFare(){return distance*1.5;} }
    static class Flight extends Booking { Flight(double d){super(d);}double baseFare(){return 2500+distance*4;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();double km=in.nextDouble();Booking b;
            if(type.equals("BUS"))b=new Bus(km);else if(type.equals("TRAIN"))b=new Train(km);else b=new Flight(km);
            total+=b.total();System.out.printf("%s: %.2f%n",type,b.total());
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
