
import java.util.Scanner;

public class Q3 {
    static abstract class Room { int units;Room(int units){this.units=units;}abstract double bill(); }
    static class SingleRoom extends Room { SingleRoom(int u){super(u);}double bill(){return units*8.0;} }
    static class SharedRoom extends Room { int occupants;SharedRoom(int u,int o){super(u);occupants=o;}double bill(){return units*6.0/occupants;} }
    static class AcRoom extends Room { AcRoom(int u){super(u);}double bill(){return units*10.0+200;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next();int units=in.nextInt();Room room;
            if(type.equals("SINGLE"))room=new SingleRoom(units);else if(type.equals("SHARED"))room=new SharedRoom(units,in.nextInt());else room=new AcRoom(units);
            total+=room.bill();System.out.printf("%s: %.2f%n",type,room.bill());
        }
        System.out.printf("Total: %.2f%n",total);in.close();
    }
}
