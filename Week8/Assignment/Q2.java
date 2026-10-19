
import java.util.Scanner;

public class Q2 {
    interface Vehicle { double charge(int hours); }
    static class Bike implements Vehicle { public double charge(int h){return h*10.0;} }
    static class Car implements Vehicle { public double charge(int h){return 30+Math.max(0,h-1)*20.0;} }
    static class Truck implements Vehicle { public double charge(int h){return Math.max(100,h*50.0);} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();int hours=in.nextInt();Vehicle v;
            if(type.equals("BIKE"))v=new Bike();else if(type.equals("CAR"))v=new Car();else v=new Truck();
            double amount=v.charge(hours);total+=amount;System.out.printf("%s: %.2f%n",type,amount);
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
