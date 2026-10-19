
import java.util.Scanner;

public class Q4 {
    static abstract class Connection { int units;Connection(int u){units=u;}abstract double bill(); }
    static class Home extends Connection { Home(int u){super(u);}double bill(){return Math.min(units,100)*5.0+Math.max(0,units-100)*7.0;} }
    static class Shop extends Connection { Shop(int u){super(u);}double bill(){return units*8.0+100;} }
    static class Factory extends Connection { Factory(int u){super(u);}double bill(){return Math.max(units*6.0,1000);} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();int units=in.nextInt();Connection c;
            if(type.equals("HOME"))c=new Home(units);else if(type.equals("SHOP"))c=new Shop(units);else c=new Factory(units);
            total+=c.bill();System.out.printf("%s: %.2f%n",type,c.bill());
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
