fun main(args: Array<String>) {
    val nums = intArrayOf(1,2,3,4,5,6,7)
    rotate(nums, 3)
    for (num in nums) print(num)
}

fun rotate(nums: IntArray, k: Int): Unit {
    var k = k % nums.size
    if (nums.size < 2 || k == 0) return
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, k - 1)
    reverse(nums, k, nums.size - 1)
}

fun reverse(nums: IntArray, start: Int, end: Int): Unit {
    var temp: Int;
    var start = start
    var end = end
    while (start < end) {
        temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}