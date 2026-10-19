
import java.util.Scanner;

public class Q5 {
    interface SaverMode { double savedUnits(double normalUnits); }
    static abstract class Appliance { double hours;Appliance(double h){hours=h;}abstract double power();double units(){return power()*hours/1000.0;} }
    static class Fridge extends Appliance { Fridge(double h){super(h);}double power(){return 150;} }
    static class AirConditioner extends Appliance implements SaverMode { AirConditioner(double h){super(h);}double power(){return 1500;}public double savedUnits(double u){return u*0.75;} }
    static class Television extends Appliance { Television(double h){super(h);}double power(){return 100;} }
    static class Washer extends Appliance implements SaverMode { Washer(double h){super(h);}double power(){return 500;}public double savedUnits(double u){return u*0.75;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();double hours=in.nextDouble();boolean saver=in.hasNext("SAVER");if(saver)in.next();Appliance a;
            if(type.equals("FRIDGE"))a=new Fridge(hours);else if(type.equals("AC"))a=new AirConditioner(hours);else if(type.equals("TV"))a=new Television(hours);else a=new Washer(hours);
            if(saver&&!(a instanceof SaverMode)){System.out.println(type+": saver mode not supported");continue;}
            double units=a.units();if(saver)units=((SaverMode)a).savedUnits(units);double cost=units*8;total+=cost;
            System.out.printf("%s: Units=%.2f Cost=%.2f%n",type,units,cost);
        }
        System.out.printf("Total Cost: %.2f%n",total);in.close();
    }
}
