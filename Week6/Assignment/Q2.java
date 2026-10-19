
public class Q2 {
    static class PayrollAccount {
        private double basicSalary,bonus;
        PayrollAccount(double openingSalary){if(openingSalary<0){System.out.println("Warning: salary cannot be negative; using 0.");basicSalary=0;}else basicSalary=openingSalary;}
        void creditBonus(double amount){if(amount<=0)System.out.println("Bonus rejected: amount must be positive");else bonus+=amount;}
        void deductTax(double percent){if(percent<0||percent>100){System.out.println("Tax rejected: use a percentage from 0 to 100");return;}basicSalary-=basicSalary*percent/100.0;}
        double getNetSalary(){return basicSalary+bonus;}
    }
    public static void main(String[] args) {
        PayrollAccount account=new PayrollAccount(50000);account.creditBonus(5000);account.deductTax(10);
        System.out.println("Net salary: Rs "+account.getNetSalary());
    }
}
