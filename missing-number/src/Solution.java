public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,3,4,5};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int expected = (nums.length * (nums.length + 1))/2;
        int actual = 0;
        for(int i : nums) actual += i;
        return expected - actual;
    }
}
