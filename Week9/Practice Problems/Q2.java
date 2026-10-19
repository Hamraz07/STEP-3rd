
import java.util.Scanner;

public class Q2 {
    static abstract class Staff { String name;Staff(String name){this.name=name;}abstract double pay(); }
    static class FullTime extends Staff { double salary;FullTime(String n,double s){super(n);salary=s;}double pay(){return salary;} }
    static class Hourly extends Staff { double hours,rate;Hourly(String n,double h,double r){super(n);hours=h;rate=r;}double pay(){return Math.min(hours,40)*rate+Math.max(0,hours-40)*rate*1.5;} }
    static class Intern extends Staff { double stipend;Intern(String n,double s){super(n);stipend=s;}double pay(){return stipend;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next(),name=in.next();Staff person;
            if(type.equals("FULLTIME"))person=new FullTime(name,in.nextDouble());
            else if(type.equals("HOURLY"))person=new Hourly(name,in.nextDouble(),in.nextDouble());
            else person=new Intern(name,in.nextDouble());
            total+=person.pay();System.out.printf("%s: %.2f%n",person.name,person.pay());
        }
        System.out.printf("Total Payroll: %.2f%n",total);in.close();
    }
}
