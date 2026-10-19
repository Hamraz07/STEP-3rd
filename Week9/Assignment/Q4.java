
import java.util.Scanner;

public class Q4 {
    interface NightService { double addNightCharge(double fare); }
    static abstract class Cab { double km;static final double MINIMUM_FARE=100;Cab(double km){this.km=km;}abstract double rate();double dayFare(){return Math.max(MINIMUM_FARE,km*rate());} }
    static class Mini extends Cab { Mini(double k){super(k);}double rate(){return 10;} }
    static class Sedan extends Cab implements NightService { Sedan(double k){super(k);}double rate(){return 14;}public double addNightCharge(double fare){return fare*1.2;} }
    static class SUV extends Cab implements NightService { SUV(double k){super(k);}double rate(){return 18;}public double addNightCharge(double fare){return fare*1.2;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();double km=in.nextDouble();String time=in.next();Cab cab;
            if(type.equals("MINI"))cab=new Mini(km);else if(type.equals("SEDAN"))cab=new Sedan(km);else cab=new SUV(km);
            if(time.equals("NIGHT")&&!(cab instanceof NightService)){System.out.println("MINI: night service not available");continue;}
            double fare=cab.dayFare();if(time.equals("NIGHT"))fare=((NightService)cab).addNightCharge(fare);
            total+=fare;System.out.printf("%s: %.2f%n",type,fare);
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
