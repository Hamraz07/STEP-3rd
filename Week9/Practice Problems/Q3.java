
import java.util.Scanner;

public class Q3 {
    static abstract class LibraryItem { String title;int daysLate;LibraryItem(String t,int d){title=t;daysLate=d;}abstract double fine(); }
    static class Book extends LibraryItem { Book(String t,int d){super(t,d);}double fine(){return daysLate*2.0;} }
    static class DVD extends LibraryItem { DVD(String t,int d){super(t,d);}double fine(){return Math.min(daysLate*5.0,50.0);} }
    static class Magazine extends LibraryItem { Magazine(String t,int d){super(t,d);}double fine(){return daysLate*1.0;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){
            String type=in.next(),title=in.next();int late=in.nextInt();LibraryItem item;
            if(type.equals("BOOK"))item=new Book(title,late);else if(type.equals("DVD"))item=new DVD(title,late);else item=new Magazine(title,late);
            total+=item.fine();System.out.printf("%s: %.2f%n",item.title,item.fine());
        }
        System.out.printf("Total Fines: %.2f%n",total);in.close();
    }
}
