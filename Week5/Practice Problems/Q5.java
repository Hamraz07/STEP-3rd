
import java.util.Arrays;

public class Q5 {
    static class Candidate implements Comparable<Candidate> {
        String name; double cgpa; int codingScore;
        Candidate(String name,double cgpa,int codingScore) { this.name=name; this.cgpa=cgpa; this.codingScore=codingScore; }
        double compositeScore() { return cgpa*10 + codingScore*0.5; }
        public int compareTo(Candidate other) { return Double.compare(other.compositeScore(),compositeScore()); }
    }
    static boolean isEligible(double cgpa) { return cgpa>=7.5; }
    static boolean isEligible(double cgpa,int codingScore) { return cgpa>=6.5 && codingScore>=60; }
    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] chosen=new Candidate[candidates.length]; int count=0;
        for (Candidate c:candidates) if (isEligible(c.cgpa)||isEligible(c.cgpa,c.codingScore)) chosen[count++]=c;
        Candidate[] shortlist=Arrays.copyOf(chosen,count); Arrays.sort(shortlist);
        StringBuilder out=new StringBuilder();
        for (int i=0;i<shortlist.length;i++) {
            if (i>0) out.append(" | ");
            out.append(i+1).append(". ").append(shortlist[i].name).append(" (").append(shortlist[i].compositeScore()).append(')');
        }
        return out.toString();
    }
    public static void main(String[] args) {
        Candidate[] people={new Candidate("Aisha",8.2,40),new Candidate("Rohit",6.8,65),new Candidate("Meena",6.0,90),new Candidate("Karan",7.5,20)};
        System.out.println(shortlistAndRank(people));
    }
}
