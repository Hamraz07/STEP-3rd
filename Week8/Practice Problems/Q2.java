
import java.time.LocalDate;
import java.util.Scanner;

public class Q2 {
    static abstract class LibraryItem { String title;LibraryItem(String title){this.title=title;}abstract int borrowingDays(); }
    static class Book extends LibraryItem { Book(String t){super(t);}int borrowingDays(){return 14;} }
    static class DVD extends LibraryItem { DVD(String t){super(t);}int borrowingDays(){return 7;} }
    static class Magazine extends LibraryItem { Magazine(String t){super(t);}int borrowingDays(){return 3;} }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);int n=Integer.parseInt(in.nextLine().trim());LocalDate today=LocalDate.of(2023,10,26);
        for(int i=0;i<n;i++){
            String[] parts=in.nextLine().split(" ",2);String title=parts[1].trim().replace("\"", "");LibraryItem item;
            if(parts[0].equals("BOOK"))item=new Book(title);else if(parts[0].equals("DVD"))item=new DVD(title);else item=new Magazine(title);
            System.out.println(item.title+": "+today.plusDays(item.borrowingDays()));
        }
        in.close();
    }
}
