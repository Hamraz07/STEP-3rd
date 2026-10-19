
public class Q5 {
    static int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while (left<right) {
            int middle=left+(right-left)/2;
            if (nums[middle]>nums[right]) left=middle+1;
            else right=middle;
        }
        return nums[left];
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
}
