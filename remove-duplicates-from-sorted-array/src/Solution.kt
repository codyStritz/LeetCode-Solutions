class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 1) return nums.size
        var i = 0   // Slow runner
        for (j in 1 until nums.size) {  // Fast runner
            if (nums[j] != nums[i]) {
                i++ // Increment slow runner
                nums[i] = nums[j]   // Set slow runner to value found by fast runner
            }
        }
        return i + 1
    }
}