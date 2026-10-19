
import java.util.HashMap;
import java.util.Map;

public class Q4 {
    static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixCounts=new HashMap<>();
        prefixCounts.put(0,1);
        int prefixSum=0,answer=0;
        for (int number:nums) {
            prefixSum+=number;
            answer+=prefixCounts.getOrDefault(prefixSum-k,0);
            prefixCounts.put(prefixSum,prefixCounts.getOrDefault(prefixSum,0)+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
}
