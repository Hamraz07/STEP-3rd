
import java.util.Scanner;

public class Q1 {
    static abstract class Plot { String owner;Plot(String owner){this.owner=owner;}abstract double area();abstract String type(); }
    static class Circle extends Plot { double radius;Circle(String o,double r){super(o);radius=r;}double area(){return Math.PI*radius*radius;}String type(){return "CIRCLE";} }
    static class Rectangle extends Plot { double length,width;Rectangle(String o,double l,double w){super(o);length=l;width=w;}double area(){return length*width;}String type(){return "RECTANGLE";} }
    static class Triangle extends Plot { double base,height;Triangle(String o,double b,double h){super(o);base=b;height=h;}double area(){return base*height/2;}String type(){return "TRIANGLE";} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next(),owner=in.next();Plot p;
            if(type.equals("CIRCLE"))p=new Circle(owner,in.nextDouble());
            else if(type.equals("RECTANGLE"))p=new Rectangle(owner,in.nextDouble(),in.nextDouble());
            else p=new Triangle(owner,in.nextDouble(),in.nextDouble());
            total+=p.area();System.out.printf("%s (%s): %.2f%n",p.owner,p.type(),p.area());
        }
        System.out.printf("Total Area: %.2f%n",total);in.close();
    }
}
