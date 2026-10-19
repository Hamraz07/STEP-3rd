
import java.util.Scanner;

public class Q5 {
    static abstract class Transport { double distance;Transport(double d){distance=d;}abstract double fare(); }
    static class Bus extends Transport { Bus(double d){super(d);}double fare(){return 2+0.1*distance;} }
    static class Train extends Transport { Train(double d){super(d);}double fare(){return 3+0.15*distance;} }
    static class Metro extends Transport { double factor;Metro(double d,double f){super(d);factor=f;}double fare(){return (1.5+0.2*distance)*factor;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();double distance=in.nextDouble();Transport t;
            if(type.equals("BUS"))t=new Bus(distance);else if(type.equals("TRAIN"))t=new Train(distance);else t=new Metro(distance,in.nextDouble());
            total+=t.fare();System.out.printf("%s: %.2f%n",type,t.fare());
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
