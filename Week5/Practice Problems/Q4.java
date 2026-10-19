
public class Q4 {
    private static double rowAverage(int[] row) {
        if (row.length==0) return 0;
        int sum=0; for (int score:row) sum+=score;
        return (double)sum/row.length;
    }
    static String classifyRows(int[][] scores,int threshold) {
        StringBuilder result=new StringBuilder();
        for (int i=0;i<scores.length;i++) {
            if (i>0) result.append(" | ");
            result.append("Row ").append(i).append(": ")
                  .append(rowAverage(scores[i])<threshold?"Quiet Zone":"Buzzing Zone");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int[][] rows={{40,50,45},{85,90,95},{30,20,25}};
        System.out.println(classifyRows(rows,60));
    }
}
