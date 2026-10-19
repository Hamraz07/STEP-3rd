
import java.util.Scanner;

public class Q2 {
    interface Insurable { double insurance(); }
    static abstract class Parcel { double weight,value;Parcel(double w,double v){weight=w;value=v;}abstract double charge(); }
    static class Standard extends Parcel { Standard(double w,double v){super(w,v);}double charge(){return 40+10*weight;} }
    static class Express extends Parcel implements Insurable { Express(double w,double v){super(w,v);}double charge(){return 80+15*weight;}public double insurance(){return value*0.02;} }
    static class Fragile extends Parcel implements Insurable { Fragile(double w,double v){super(w,v);}double charge(){return 40+10*weight+50;}public double insurance(){return value*0.02;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double grand=0;
        for(int i=0;i<n;i++){
            String type=in.next();double weight=in.nextDouble(),value=in.nextDouble();Parcel p;
            if(type.equals("STANDARD"))p=new Standard(weight,value);else if(type.equals("EXPRESS"))p=new Express(weight,value);else p=new Fragile(weight,value);
            double insurance=p instanceof Insurable?((Insurable)p).insurance():0;
            double amount=p.charge()+insurance;grand+=amount;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",type,p.charge(),insurance,amount);
        }
        System.out.printf("Grand Total: %.2f%n",grand);in.close();
    }
}
