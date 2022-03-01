public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int i = 0;  // Slow runner
        for (int j = 1; j < nums.length; j++) {  // Fast runner
            if (nums[j] != nums[i]) {
                i++;    // Increment slow runner
                nums[i] = nums[j]; // Set slow runner to value found by fast runner
            }
        }
        return i + 1;
    }
}
