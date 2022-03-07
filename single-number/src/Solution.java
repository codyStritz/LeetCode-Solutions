public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,3,4,1,5,5};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer ^= num;
        }
        return answer;
    }
}
