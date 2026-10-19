
public class Q1 {
    static class PiggyBank {
        private final String id;private double savings;
        PiggyBank(String id){this.id=id;this.savings=0;}
        void deposit(double amount){if(amount>0)savings+=amount;else System.out.println("Deposit must be positive");}
        boolean withdraw(double amount){if(amount<=0||amount>savings){System.out.println("Withdrawal rejected");return false;}savings-=amount;return true;}
        double getSavings(){return savings;}
        String getId(){return id;}
    }
    public static void main(String[] args) {
        PiggyBank bank=new PiggyBank("PB-1");bank.deposit(100);bank.withdraw(30);bank.withdraw(500);
        System.out.println(bank.getId()+" savings: "+bank.getSavings());
    }
}
