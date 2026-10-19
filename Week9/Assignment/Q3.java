
import java.util.Scanner;

public class Q3 {
    static abstract class Student { String name;Student(String n){name=n;}abstract double tuition();abstract boolean usesBus();double totalFee(){return tuition()+(usesBus()?12000:0);} }
    static class DayScholar extends Student { DayScholar(String n){super(n);}double tuition(){return 40000;}boolean usesBus(){return true;} }
    static class Hosteller extends Student { Hosteller(String n){super(n);}double tuition(){return 100000;}boolean usesBus(){return false;} }
    static class Scholar extends Student { Scholar(String n){super(n);}double tuition(){return 20000;}boolean usesBus(){return true;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next(),name=in.next();Student student;
            if(type.equals("DAY_SCHOLAR"))student=new DayScholar(name);else if(type.equals("HOSTELLER"))student=new Hosteller(name);else student=new Scholar(name);
            total+=student.totalFee();System.out.printf("%s: %.2f%n",student.name,student.totalFee());
        }
        System.out.printf("Total Collected: %.2f%n",total);in.close();
    }
}
