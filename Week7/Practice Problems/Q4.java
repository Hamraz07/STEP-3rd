
public class Q4 {
    static class Locker {
        private final int lockerNumber;private String combinationCode;
        Locker(int lockerNumber,String startingCode){this.lockerNumber=lockerNumber;this.combinationCode=startingCode;}
        boolean changeCode(String currentCode,String newCode){if(!combinationCode.equals(currentCode)){System.out.println("Code change rejected");return false;}combinationCode=newCode;return true;}
        int getLockerNumber(){return lockerNumber;}
    }
    public static void main(String[] args) {
        Locker locker=new Locker(101,"1234");
        System.out.println("First change: "+locker.changeCode("1234","5678"));
        System.out.println("Second change: "+locker.changeCode("0000","9999"));
    }
}
