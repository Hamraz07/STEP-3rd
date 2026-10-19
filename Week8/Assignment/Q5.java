
import java.time.LocalDate;
import java.util.Scanner;

public class Q5 {
    interface Plan { int validityDays(); }
    static class Basic implements Plan { public int validityDays(){return 30;} }
    static class Standard implements Plan { public int validityDays(){return 90;} }
    static class Premium implements Plan { public int validityDays(){return 365;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=Integer.parseInt(in.nextLine().trim());
        for(int i=0;i<n;i++){
            String[] parts=in.nextLine().trim().split("\\s+");String type=parts[0],name=parts[1];LocalDate start=LocalDate.parse(parts[2]);Plan plan;
            if(type.equals("BASIC"))plan=new Basic();else if(type.equals("STANDARD"))plan=new Standard();else plan=new Premium();
            System.out.println(name+": "+start.plusDays(plan.validityDays()));
        }
        in.close();
    }
}
