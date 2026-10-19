
public class Q5 {
    static class AttendanceSheet {
        private final String[] presentNames;private int count;
        AttendanceSheet(int maximumStudents){presentNames=new String[maximumStudents];}
        void markPresent(String name){
            if(isPresent(name))return;
            if(count==presentNames.length){System.out.println("Attendance sheet is full");return;}
            presentNames[count++]=name;
        }
        int getPresentCount(){return count;}
        boolean isPresent(String name){for(int i=0;i<count;i++)if(presentNames[i].equals(name))return true;return false;}
    }
    public static void main(String[] args) {
        AttendanceSheet sheet=new AttendanceSheet(30);sheet.markPresent("Ana");sheet.markPresent("Ben");sheet.markPresent("Ana");
        System.out.println("Present: "+sheet.getPresentCount());System.out.println("Ben present: "+sheet.isPresent("Ben"));
    }
}
