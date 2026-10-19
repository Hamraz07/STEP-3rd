
import java.util.Scanner;

public class Q4 {
    interface BonusRule { double bonus(double salary); }
    static class FullTime implements BonusRule { public double bonus(double s){return s*0.10;} }
    static class PartTime implements BonusRule { public double bonus(double s){return s*0.05;} }
    static class Intern implements BonusRule { public double bonus(double s){return 2000;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next(),name=in.next();double salary=in.nextDouble();BonusRule rule;
            if(type.equals("FULLTIME"))rule=new FullTime();else if(type.equals("PARTTIME"))rule=new PartTime();else rule=new Intern();
            double amount=rule.bonus(salary);total+=amount;System.out.printf("%s: %.2f%n",name,amount);
        }
        System.out.printf("Total Bonus: %.2f%n",total);in.close();
    }
}
