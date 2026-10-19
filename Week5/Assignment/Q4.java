
public class Q4 {
    private static double rowAverage(int[] row) {
        if(row.length==0)return 0;
        int total=0;for(int runs:row)total+=runs;
        return (double)total/row.length;
    }
    static String classifyMatches(int[][] runs,int threshold) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<runs.length;i++) {
            if(i>0)result.append(" | ");
            result.append("Match ").append(i).append(": ")
                  .append(rowAverage(runs[i])>=threshold?"Power Surge":"Normal");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int[][] runs={{4,6,8},{10,12,14},{2,3,1}};
        System.out.println(classifyMatches(runs,8));
    }
}
