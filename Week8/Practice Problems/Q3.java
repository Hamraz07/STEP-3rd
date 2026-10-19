
import java.util.Scanner;

public class Q3 {
    static abstract class Delivery { double weight,distance;Delivery(double w,double d){weight=w;distance=d;}abstract double fee(); }
    static class Standard extends Delivery { Standard(double w,double d){super(w,d);}double fee(){return 5+0.5*weight+0.1*distance;} }
    static class Express extends Delivery { Express(double w,double d){super(w,d);}double fee(){return 15+weight+0.2*distance;} }
    static class International extends Delivery { double customs;International(double w,double d,double c){super(w,d);customs=c;}double fee(){return 25+2*weight+0.5*distance+customs;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();double weight=in.nextDouble(),distance=in.nextDouble();Delivery d;
            if(type.equals("STANDARD"))d=new Standard(weight,distance);
            else if(type.equals("EXPRESS"))d=new Express(weight,distance);
            else d=new International(weight,distance,in.nextDouble());
            total+=d.fee();System.out.printf("%s: %.2f%n",type,d.fee());
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
