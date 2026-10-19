
import java.util.Arrays;

public class Q4 {
    static int[] mergeSortedArrays(int[] first, int[] second) {
        int[] result=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i<first.length && j<second.length) {
            if (first[i]<=second[j]) result[k++]=first[i++];
            else result[k++]=second[j++];
        }
        while (i<first.length) result[k++]=first[i++];
        while (j<second.length) result[k++]=second[j++];
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1,3,5},new int[]{2,4,6})));
    }
}
